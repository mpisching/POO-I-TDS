import java.math.BigDecimal;

public class MainApp {
    public static void main(String[] args) {

        Categoria categoria1 = new Categoria();
        categoria1.setId(1);
        categoria1.setDescricao("Eletrônicos");
        Categoria categoria2 = new Categoria(2, "Eletrodomésticos");

        Produto produto1 = new Produto();
        produto1.setId(1);
        produto1.setNome("Celular");
        produto1.setDescricao("Celular 7\"");
        produto1.setPreco(new BigDecimal(1200.0));
        produto1.setCategoria(categoria1);

        Produto produto2 = new Produto(
                2, "Geladeira", "Geladeira Frost Free",
                new BigDecimal(3200.0));
        produto2.setCategoria(categoria2);

        Produto produto3 = new Produto(3, "TV", "TV plana qled",
                new BigDecimal(2300.0), categoria1);
//        Estoque estoque = new Estoque(1000, 100);
        Produto produto4 = new Produto(4, "Fogão", "Fogão 5 bocas", new BigDecimal(1101.0),
                categoria2, 1000, 100);
        produto4.getEstoque().setSituacao(ESituacao.INATIVO);
        //if (produto4.getEstoque().getSituacao() == ESituacao.ATIVO) {
        try {
            produto4.getEstoque().repor(30);
            produto4.getEstoque().retirar(15);
        } catch (RuntimeException ex) {
            System.out.println("Falha: " + ex.getMessage());
        }
        //}

        Fornecedor fornecedor1 = new Fornecedor(1, "IFSC", "contato@ifsc.edu.br", "48999948847");
        try {
            fornecedor1.add(produto1);
            fornecedor1.add(produto3);
        } catch(RuntimeException exc) {
            System.out.println(exc.getMessage());
        }

        Fornecedor fornecedor2 = new Fornecedor(2, "UFSC", "contato@ufsc.edu.br", "4839393999");
        try {
            fornecedor2.add(produto2);
            fornecedor2.add(produto3);
        } catch(RuntimeException exc) {
            System.out.println(exc.getMessage());
        }

        Fornecedor fornecedor3 = new Fornecedor(3, "SENAC", "contato@senac.com.br", "34343343");

        printEstoque(produto1);
        produto1.getEstoque().setQtdMaxima(1000);
        produto1.getEstoque().setQtdMinima(10);
        try {
            produto1.getEstoque().repor(2000);
        } catch (IllegalArgumentException ex) {
            System.out.println("Falha na operação: " + ex.getMessage());
        }

        printEstoque(produto1);
        System.out.println("Categoria do produto 4: " + categoria2.getDescricao());
        printEstoque(produto4);

    }

    public static void print(Categoria categoria){
        System.out.println("Dados da categoria:");
        System.out.println(categoria.toString());
    }

    public static void print(Produto produto){
        System.out.println("**** Dados do Produto ****");
        System.out.println(produto.toString());
    }

    public static void printCategoria(Produto produto) {
        System.out.println("Nome: " +  produto.getNome());
        System.out.println("Categoria: " +  produto.getCategoria().getDescricao());
    }

    public static void print(Fornecedor fornecedor) {
        System.out.println(fornecedor.getDados());
    }

    public static void printEstoque(Produto produto) {
        System.out.println("Detalhes do estoque do produto " + produto.getNome());
        System.out.println("Quantidade Atual .....: " + produto.getEstoque().getQuantidade());
        System.out.println("Quantidade Máxima ....: " + produto.getEstoque().getQtdMaxima());
        System.out.println("Quantidade Mínima ....: " + produto.getEstoque().getQtdMinima());
        System.out.println("Situação..............: " + produto.getEstoque().getSituacao().getDescricao());;

    }

}
