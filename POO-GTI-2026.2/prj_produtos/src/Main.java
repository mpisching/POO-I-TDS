import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Caneta");
        Produto p2 = new Produto();
        Produto p3 = new Produto(
                "Celular", "LG", 1500, 10, 100);
        Produto p4 = new Produto("TV", "AOC");

        //p1.nome = "Caneta";
        //método construtor de classe
        System.out.println("Produto: " + p1.toString());
        System.out.println("Produto: " + p2.toString());
        System.out.println("Produto: " + p3.toString());
        JOptionPane.showMessageDialog(null, p1, "Dados do Produto",
                JOptionPane.QUESTION_MESSAGE);
    }
}