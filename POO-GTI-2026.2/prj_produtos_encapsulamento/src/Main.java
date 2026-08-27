import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Caneta");
        p1.setMarca("BIC");
        try {
            p1.setQuantidade(100);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
//        if (p1.quantidade < -10) {
//            p1.quantidade = 0;
//            System.out.println("a qtd não pode ser negativa...");
//        }
        p1.setLimiteMaximo(2000);
        p1.setPreco(5.0);
        System.out.println("Produto: " + p1.toString());

        try {
            p1.repor(200);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Produto atualizado...: " + p1.toString());

        try {
            p1.retirar(1100);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Produto atualizado depois da retirada...: " + p1.toString());

    }
}