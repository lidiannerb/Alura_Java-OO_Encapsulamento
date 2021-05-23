public class TestaGetESet {

    public static void main(String[] args) {
        Conta conta = new Conta(262, 2627);
        System.out.println(conta.getNumero());

        Cliente lidi = new Cliente();
        lidi.setNome("Lidianne Romão");
        conta.setTitular(lidi);

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("programador");
        // fazendo o mesmo, mas em duas linhas:

        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("programador");

    }
}
