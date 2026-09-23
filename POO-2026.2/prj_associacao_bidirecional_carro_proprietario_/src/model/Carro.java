package model;

public class Carro {
//    Roda roda1 = new Roda();
//    Roda roda2 = new Roda();
//    Roda roda3 = new Roda();
//    Roda roda4 = new Roda();
    private Roda[] rodas = new Roda[4];

    private Proprietario proprietario;

    private String modelo;

    public Carro() {
    }

    public Carro(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Roda[] getRodas() {
        return rodas;
    }

    public void setRodas(Roda[] rodas) {
        this.rodas = rodas;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }
}
