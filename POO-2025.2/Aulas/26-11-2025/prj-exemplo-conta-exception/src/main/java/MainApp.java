public class MainApp {
    public static void main(String[] args) {
        Conta conta = new Conta(1, 1000.0);
        conta.depositar(500.0);

        try {
            conta.sacar(2500.0);
        } catch (ContaException e) {
            System.out.println("Erro ao sacar: " + e.getMessage());
            System.out.println("Causa: " + e.getCause());
        } catch (Exception e) {
            System.out.println("Erro ao sacar: " + "desconhecido");
        } finally {
            System.out.println("Operação finalizada");
        }


        System.out.println("Saldo atual: " + conta.getSaldo());
    }
}
