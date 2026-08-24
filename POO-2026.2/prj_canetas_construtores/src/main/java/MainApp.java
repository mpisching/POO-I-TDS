public class MainApp {
    public static void main(String[] args) {
        int x, y, z;
        Caneta caneta1 = new Caneta("BIC");
        Caneta caneta2 = new Caneta("Pentel", "Quadro branco", "Verde", 2.0f );
        Caneta caneta3 = new Caneta("Faber Castell", "Esferográfica");

//        caneta1.modelo = "Esferográfica";
//        caneta1.cor = "Vermelha";
//        caneta1.ponta = 0.7f;
        //caneta1.carga = 100;

        System.out.println("Caneta 1:" + caneta1.toString());
        System.out.println("Caneta 2:" + caneta2.toString());
        System.out.println("Caneta 3:" + caneta3.toString());

    }
}
