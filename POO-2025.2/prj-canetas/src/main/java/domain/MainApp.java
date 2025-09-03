package domain;

public class MainApp {
    public static void main(String[] args) {

        Caneta c1 = new Caneta();
        Carga carga1 = new Carga();
        c1.carga = carga1;

        //c1.cor = "Vermelha";
//        c1.carga.qtdCarga = 100;
//        c1.tampada = true;
//        c1.preco = 10.0;

        //c2.cor = "Verde";
        //c2.carga = 80;
        //c2. tampada = false;

//        c3.cor = "Azul";
//        c3.carga = 120;
//        c3.tampada = true;

        System.out.println("-".repeat(50));

        System.out.println("caneta 1: ");
        System.out.println("cor: " + c1.carga.cor);
        System.out.println("carga: " + c1.carga.tipo);
        System.out.println("tampada: " + c1.tampada);
        System.out.println("Preco: " + c1.preco);

        System.out.println("-".repeat(50));

//        System.out.println("caneta 2: ");
//        System.out.println("cor: " + c2.cor);
//        System.out.println("carga: " + c2.carga);
//        System.out.println("tampada: " + c2.tampada);
//
//        System.out.println("-".repeat(50));
//
//        System.out.println("caneta 3: ");
//        System.out.println("cor: " + c3.cor);
//        System.out.println("carga: " + c3.carga);
//        System.out.println("tampada: " + c3.tampada);
    }
}
