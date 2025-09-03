public class MainApp {
    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        c1.raio = 20;

        Triangulo t1 = new Triangulo();
        t1.altura = 10;
        t1.base = 20;

        Quadrado q1 = new Quadrado();
        q1.altura = 40;
        q1.base = 40;


        System.out.println("Raio do Círculo: "+c1.raio);

        System.out.println("Dimensões do triângulo: "+t1.altura+", "+t1.base);

        System.out.println("Dimensões da quadrado: "+q1.altura+", "+q1.base);

    }

}
