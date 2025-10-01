public class MainApp {
    public static void main(String[] args) {
        //declaração de variável de referência
        Caneta c1, c2; //endereço de memória onde reside um objeto
        //instanciação de um objeto caneta e a atribuição a uma variável de referência
        c1 = new Caneta();
        c2 = new Caneta();
        c1.cor = "Azul";
        c2.cor = "Verde";
        c1.ponta = 0.5f;
        c2.ponta = 0.5f;
        c1.tampada = true;
        c2.tampada = false;
        c1.carga = 100;
        c2.carga = 80;

        System.out.println("Cor: " + c1.cor);
        System.out.println("Ponta: " + c1.ponta);
        System.out.println("Tampada: " + c1.tampada);
        System.out.println("Carga: " + c1.carga);
        System.out.println("Cor: " + c2.cor);
        System.out.println("Ponta: " + c2.ponta);
        System.out.println("Tampada: " + c2.tampada);
        System.out.println("Carga: " + c2.carga);



    }
}
