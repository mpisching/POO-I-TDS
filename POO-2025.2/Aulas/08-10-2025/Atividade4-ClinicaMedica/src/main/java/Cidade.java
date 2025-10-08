public class Cidade {
    private String nome;
    private String uf;

    //Construtores
    public Cidade() {
    }

    public Cidade(String nome, String uf) {
        this.nome = nome;
        this.uf = uf;
    }

    //Getters
    public String getNome() {
        return nome;
    }

    public String getUf() {
        return uf;
    }

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "Cidade{" +
                "nome='" + nome + '\'' +
                ", uf='" + uf + '\'' +
                '}';
    }
}
