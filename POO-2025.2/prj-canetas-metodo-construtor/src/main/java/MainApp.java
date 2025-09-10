public class MainApp {
    public static void main(String[] args) {
        Caneta c = new Caneta("bic", "verde", 0.5f, 100, true);
        Caneta caneta = new Caneta("Azul", 0.5f);
        //caneta.cor = "vermelha";
        //caneta.ponta = 0.5f;
        caneta.destampar();
        caneta.escrever("Bem-vindos a aula de POO");

        Caneta caneta2 = new Caneta("Preto");
        Caneta caneta3 = new Caneta();
        caneta3.ponta = 0.7f;
        caneta3.cor = "Verde";


        //caneta.consumirCarga(50);

        caneta.pintar();
        caneta.tampar();


        System.out.println(caneta.toString());
    }
}
