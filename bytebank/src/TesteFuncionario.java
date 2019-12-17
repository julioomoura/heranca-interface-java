public class TesteFuncionario {

    public static void main(String[] args) {

        Gerente g1 = new Gerente();
        g1.setNome("Júlio");
        g1.setSalario(1100.0);

        Designer d = new Designer();
        d.setNome("Gaby");
        d.setSalario(2000.0);

        Administrador adm = new Administrador();
        adm.setSenha(3333);

        ControleBonificacao cb = new ControleBonificacao();
        cb.registra(g1);
        cb.registra(d);

        System.out.println(cb.getSoma());

        g1.setSenha(2222);

        SistemaInterno si = new SistemaInterno();
        si.autentica(g1);
        si.autentica(adm );
    }
}
