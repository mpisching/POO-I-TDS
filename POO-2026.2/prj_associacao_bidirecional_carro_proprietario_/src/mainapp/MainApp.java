package mainapp;

import model.Carro;
import model.Proprietario;
import model.Roda;

public class MainApp {
    static void main() {
        Proprietario proprietario = new Proprietario("Fulano");
        Carro carro1 = new Carro("S10");
        Roda[] rodas = new Roda[4];
        rodas[0] = new Roda("Liga leve");
        rodas[1] = new Roda("Liga leve");
        rodas[2] = new Roda("Liga leve");
        rodas[3] = new Roda("Liga leve");

        carro1.setRodas(rodas);

        proprietario.add(carro1);

        Carro carro2 = new Carro("Ranger");
        carro2.setRodas(rodas);
        proprietario.add(carro2);

        System.out.println("dados do proprietario");
        System.out.println("Nome: " + proprietario.getNome());
        System.out.println("Carros do proprietario: ");
        for (Carro carro : proprietario.getCarros()) {
            System.out.println("Modelo: " + carro.getModelo());
            System.out.println("Rodas: ");
            for (Roda roda: carro.getRodas()) {
                System.out.println("Tipo: " + roda.getTipo());
            }
        }

        System.out.println("Nome do proprietario do carro2: " + carro2.getProprietario().getNome());
    }
}
