public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 20226);
        System.out.println(conta.getAgencia());

        Conta conta1 = new Conta(1338, 20227);
        System.out.println(conta1.getAgencia());

        Conta conta2 = new Conta(1339, 20228);
        Conta conta3 = new Conta(1340, 20229);

        System.out.println(Conta.getTotal());
    }
}
