public class MainApp {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.setNome("Celular");//modifica o valor na memória - define um novo valor
        p1.setPreco(1500.0);
        try {
            p1.setQuantidade(-20);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        p1.setLimiteMaximo(100);

        System.out.println("Exibindo dados do Produto: ");
        //método get obtem o valor do atributo na memória
        System.out.println("Nome............: " + p1.getNome());
        System.out.println("Preço...........: " + p1.getPreco());
        System.out.println("Quantidade......: " + p1.getQuantidade());
        System.out.println("Limite Máximo...: " + p1.getLimiteMaximo());
    }
}
