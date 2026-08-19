public class MainApp2 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.marca = "Faber Castell";

        System.out.println("Carga da caneta 1 - antes: " + c1.obterCarga());
        for (int i = 0; i < 100; i++) {
            c1.escrever("POO " + (i+1));
        }
        System.out.println("Carga da caneta 1:- depois " + c1.obterCarga());

    }
}
