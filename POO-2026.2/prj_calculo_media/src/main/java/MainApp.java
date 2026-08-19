import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        //cm --> variavel de referência para um objeto
        //cm contem o endereço de memória onde irá residir o objeto do tipo CalculoMedia
        CalculoMedia cm = new CalculoMedia();
        CalculoMedia cm2 = new CalculoMedia();
        //variáveis de tipos primitivos de dados
        int i, j;
        float f1, f2;
        //
        String nome;

        //char[30] nome;  '/0'

        Scanner entrada = new Scanner(System.in);
        System.out.println("Nota 1: ");
        cm.n1 = entrada.nextInt();
        System.out.println("Nota 2: ");
        cm.n2 = entrada.nextInt();
        System.out.println("Nota 3: ");
        cm.n3 = entrada.nextInt();

        System.out.println("Média: " + cm.calcularMedia());

    }
}
