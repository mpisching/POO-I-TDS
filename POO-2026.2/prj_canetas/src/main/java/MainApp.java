public class MainApp {
    public static void main(String[] args) {
        int x, y, z;
        Caneta caneta1 = new Caneta();
        Caneta caneta2 = new Caneta();
        caneta1.marca = "BIC";
        caneta1.modelo = "Esferográfica";
        caneta1.cor = "Vermelha";
        caneta1.ponta = 0.7f;
        //caneta1.carga = 100;
        caneta2.marca = "Pentel";
        caneta2.modelo = "Quadro branco";
        caneta2.cor = "Verde";
        caneta2.ponta = 2.0f;
        System.out.println("Carga da caneta 1 - antes: " + caneta1.obterCarga());
        for (int i = 0; i < 100; i++) {
            caneta1.escrever("POO " + (i+1));
        }
        System.out.println("Carga da caneta 1:- depois " + caneta1.obterCarga());

        System.out.println("Carga da caneta 2 - antes: " + caneta2.obterCarga());
        caneta2.desenhar();
        System.out.println("Carga da caneta 2 - antes: " + caneta2.obterCarga());

        System.out.println("Caneta 1:" + caneta1.toString());
        System.out.println("Caneta 2:" + caneta2.toString());

    }
}
