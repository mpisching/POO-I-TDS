package mainapp;

import domain.Marca;
import domain.Modelo;
import domain.Veiculo;
import domain.Cor;
import domain.ECategoria;
import domain.ETipoCombustivel;
import domain.Motor;

public class MainApp {

    public static void main(String[] args) {
        Marca marca1 = new Marca(10, "Volvo");
        //marca1.setId(10);
        //marca1.setNome("Volvo");

        Marca marca2 = new Marca(20, "Ford");
        //marca2.setId(20);
        //marca2.setNome("Ford");

        Marca marca3 = new Marca(30, "Toyota");
        //marca3.setId(30);
        //marca3.setNome("Toyota");

        Marca marca4 = new Marca();
        marca4.setId(40);
        marca4.setNome("Mercedes Benz");

//        Motor motor1 = new Motor();
//        motor1.setPotencia(100);

        Modelo modelo1 = new Modelo();
        modelo1.setId(5);
        modelo1.setDescricao("Sedan");
        modelo1.setMarca(marca1);
        //modifica a potencia do motor do modelo
        modelo1.getMotor().setPotencia(100);
        //modelo1 = null;
        System.out.println("Modelo: " + modelo1.getDescricao());
        //obtem a potencia do motor do modelo
        System.out.println("Potencia do motor: " + modelo1.getMotor().getPotencia());

        Modelo modelo2 = new Modelo("SUV", marca2);
        modelo2.setId(6);
        modelo2.getMotor().setPotencia(120);
        //modelo2.setDescricao("SUV");
        //modelo2.setMarca(marca2);
        System.out.println("Modelo2: " + modelo2.getDescricao());
        //obtem a potencia do motor do modelo
        System.out.println("Potencia do motor do modelo 2: " + modelo2.getMotor().getPotencia());

        Modelo modelo3 = new Modelo(10, "Ranger", marca2, 
                ECategoria.GRANDE, 200, 
                ETipoCombustivel.DIESEL);
//        modelo3.setId(7);
//        modelo3.setDescricao("Corolla Cross");
//        modelo3.setMarca(marca3);
        System.out.println("Modelo3: " + modelo3.getDescricao());
        //obtem a potencia do motor do modelo
        System.out.println("Potencia do motor do modelo 3: " + modelo3.getMotor().getPotencia());

        Modelo modelo4 = new Modelo();
        modelo4.setId(8);
        modelo4.setDescricao("CLA Coupé");
        modelo4.setMarca(marca4);

        Cor cor1 = new Cor();
        cor1.setId(12);
        cor1.setNome("Branco");

        Cor cor2 = new Cor();
        cor2.setId(13);
        cor2.setNome("Preto");

        Cor cor3 = new Cor();
        cor3.setId(14);
        cor3.setNome("Vermelho");

        Cor cor4 = new Cor();
        cor4.setId(15);
        cor4.setNome("Prata");

        Veiculo veiculo1 = new Veiculo(8, "HCO1234", modelo1, "Está Revisado");
        veiculo1.setCor(cor1);
        //veiculo1.setId(8);
        //veiculo1.setPlaca("HOC1243");
        //veiculo1.setModelo(modelo1);
        //veiculo1.setObservacoes("Revisado");

        Veiculo veiculo2 = new Veiculo(9, "GTR4321", modelo2, "Não está Revisado");
        veiculo2.setCor(cor3);
        //veiculo2.setId(9);
        //veiculo2.setPlaca("GTR4321");
        //veiculo2.setModelo(modelo2);
        //veiculo2.setObservacoes("Não está Revisado");

        Veiculo veiculo3 = new Veiculo(10, "AEH9876", modelo3, cor2, "Documento Renovado");
        //veiculo3.setId(10);
        //veiculo3.setPlaca("AEH9876");
        //veiculo3.setModelo(modelo3);
        //veiculo3.setObservacoes("Documento Renovado");

        Veiculo veiculo4 = new Veiculo(11, "PTB5678", modelo4, cor4,"Documento Pendente");
        //veiculo4.setId(11);
        //veiculo4.setPlaca("PTB5678");
        //veiculo4.setModelo(modelo4);
        //veiculo4.setObservacoes("Documento Pendente");

        print(marca1);
        print(marca2);
        print(marca3);
        print(marca4);

        print(modelo1);
        print(modelo2);
        print(modelo3);
        print(modelo4);

        print(cor1);
        print(cor2);
        print(cor3);
        print(cor4);

        print(veiculo1);
        print(veiculo2);
        print(veiculo3);
        print(veiculo4);
    }

    public MainApp() {
    }

    public static void print(Motor motor) {
        System.out.println("Dados do motor:");
        System.out.println("Potencia............:" + motor.getPotencia());
    }

    public static void print(Marca marca) {
        System.out.println("Dados da marca:");
        System.out.println("Id............:" + marca.getId());
        System.out.println("Nome..........:" + marca.getNome());
    }

    public static void print(Modelo modelo) {
        System.out.println("Dados do modelo:");
        System.out.println("Id...............:" + modelo.getId());
        System.out.println("Descricao........:" + modelo.getDescricao());
        System.out.println("Marca............:" + modelo.getMarca().getId() + "/" + modelo.getMarca().getNome());
        System.out.println("Motor............:" + modelo.getMotor().getPotencia());
        System.out.println("ETipoCmbustivel:.." + modelo.getMotor().getCombustivel());
        System.out.println("ECategoria......: " + modelo.getCategoria());
    }

    public static void print(Cor cor) {
        System.out.println("Dados da cor:");
        System.out.println("Id............:" + cor.getId());
        System.out.println("Nome..........:" + cor.getNome());
    }

    public static void print(Veiculo veiculo) {
        System.out.println("Dados do veiculo:");
        System.out.println("Id...............:" + veiculo.getId());
        System.out.println("Placa............:" + veiculo.getPlaca());
        System.out.println("Marca............:" + veiculo.getModelo().getMarca().getId() + "/" + veiculo.getModelo().getDescricao());
        System.out.println("Modelo...........:" + veiculo.getModelo().getId() +
                "/" + veiculo.getModelo().getDescricao() +
                "Categoria do modelo: " + veiculo.getModelo().getCategoria().getDescricao() + " - " +
                veiculo.getModelo().getCategoria().getId());
        System.out.println("Cor..............: " + veiculo.getCor().getId() + "/" + veiculo.getCor().getNome());
        System.out.println("Observacoes......:" + veiculo.getObservacoes());
    }
}
