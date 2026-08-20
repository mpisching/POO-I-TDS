import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //entradas
        System.out.print("Peso.....: ");
        float peso = entrada.nextFloat();
        System.out.print("Altura...: ");
        float altura = entrada.nextFloat();

        //processo - calculo
        float imc = calcularIMC(peso, altura);

        //processo - classificação
        String classificacao = classificarIMC(imc);

        //imprimir o resultado
        imprimirResultado(peso, altura, imc, classificacao);
    }

    public static float calcularIMC(float peso, float altura) {
        return peso / (altura * altura);
    }

    public static String classificarIMC(float imc) {
        if (imc < 18.5f) {
            return "Abaixo do peso";
        } else if (imc <= 24.9f) {
            return "Peso normal (saudável)";
        } else if (imc <= 29.9f) {
            return "Sobrepeso";
        } else if (imc <= 34.9f) {
            return "Obesidade grau I";
        } else if (imc <= 39.9f) {
            return "Obesidade grau II";
        } else {
            return "Obesidade grau III (grave)";
        }
    }

    public static void imprimirResultado(float peso, float altura, float imc, String classificacao) {
        System.out.println("Peso..............: " + peso);
        System.out.println("Altura............: " + altura);
        System.out.println("IMC...............: " + imc);
        System.out.println("Classificação.....: " + classificacao);
    }
}