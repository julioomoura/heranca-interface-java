public class TesteContas {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.deposita(100.0);

        ContaPoupanca cp = new ContaPoupanca(123, 123);
        cp.deposita(200.0);

        cc.transfere(10, cp);

        System.out.println("Saldo da conta corrente: " + cc.getSaldo());
        System.out.println("Saldo da conta poupança: " + cp.getSaldo());

        SeguroDeVida seguroDeVida = new SeguroDeVida();

        CalculadorImposto ci = new CalculadorImposto();
        ci.registra(cc);
        ci.registra(seguroDeVida);

        System.out.println(ci.getTotalImposto());
    }
}
