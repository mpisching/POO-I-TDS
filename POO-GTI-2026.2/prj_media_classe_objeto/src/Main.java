import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner entrada = new Scanner(System.in);
        //entradas
        System.out.print("Valor 1: ");
        int v1 = entrada.nextInt();
        System.out.print("Valor 2: ");
        int v2 = entrada.nextInt();
        System.out.print("Valor 3: ");
        int v3 = entrada.nextInt();
        System.out.print("Valor 4: ");
        int v4 = entrada.nextInt();

        Matematica matematica = new Matematica();
        //processo        3   1   5
        //int soma = somar(v1, v2, v3);
        int soma = matematica.somar(matematica.somar(v1, v2), v3);
        int media = matematica.calcularMedia(soma, 3);

        System.out.println("Media: " + media);

        soma = matematica.somar(matematica.somar(matematica.somar(v1, v2),v3),v4);
        media = matematica.calcularMedia(soma, 4);

        //saida
        System.out.println("Media: " + media);

    }

}