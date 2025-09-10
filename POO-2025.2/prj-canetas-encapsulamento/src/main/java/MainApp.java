public class MainApp {
    public static void main(String[] args) {
        Caneta c = new Caneta("bic", "verde", 0.5f, 100, true);
        Caneta caneta = new Caneta("Azul", 0.5f);
        //caneta.cor = "vermelha";
        //caneta.ponta = 0.5f;

        int novaCarga = 120;
        //if (novaCarga > 110) {
        //    System.out.println("não é possível recarregar a caneta");
       // } else {
        try {
            caneta.setCarga(novaCarga);
        } catch (RuntimeException e) {
            System.err.println("Erro ao recarregar a carga da caneta.\n" + e.getMessage());
        }
       // }

        caneta.destampar();
        caneta.escrever("Bem-vindos a aula de POO");

        Caneta caneta2 = new Caneta("Preto");
        Caneta caneta3 = new Caneta("Verde");
        caneta3.setPonta(0.7f);
        //caneta3.setCor("Verde");


        //caneta.consumirCarga(50);

        caneta.pintar();
        caneta.tampar();


        System.out.println(caneta.toString());
        System.out.println("Cor: " + caneta.getCor());
    }
}
