public class MainApp {
    public static void main(String[] args) {
        Caneta caneta = new Caneta();
        caneta.cor = "vermelha";
        caneta.ponta = 0.5f;
        caneta.destampar();
        caneta.escrever("Bem-vindos a aula de POO");
        //caneta.consumirCarga(50);

        caneta.pintar();
        caneta.tampar();


        System.out.println(caneta.toString());
    }
}
