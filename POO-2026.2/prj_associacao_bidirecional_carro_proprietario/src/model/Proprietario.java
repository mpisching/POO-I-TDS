package model_carro;

import java.util.ArrayList;
import java.util.List;

public class Proprietario {
    private String nome;
    private List<Carro> carros = new ArrayList<>();

    public Proprietario() {
    }

    public Proprietario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }

    public void add(Carro carro) {
        carros.add(carro);
        carro.setProprietario(this);
    }

    public void remove(Carro carro) {
        carros.remove(carro);
        carro.setProprietario(null);
    }
}
