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

        //processo        3   1   5
        //int soma = somar(v1, v2, v3);
        int soma = somar(somar(v1, v2), v3);
        int media = calcularMedia(soma, 3);

        System.out.println("Media: " + media);

        soma = somar(somar(somar(v1, v2),v3),v4);
        media = calcularMedia(soma, 4);

        //saida
        System.out.println("Media: " + media);

    }


    public static int somar(int n1, int n2) {
        return n1 + n2;
    }

    public static int calcularMedia(int x, int y) {
        return x / y;
    }
    //            saída           (entradas)
    //             22           5       8       9
//    public static int somar(int v1, int v2, int v3) {
//        return v1 + v2 + v3;
//    }
//
//    public static int somar(int v1, int v2, int v3, int v4) {
//        return v1 + v2 + v3 + v4;
//    }


}