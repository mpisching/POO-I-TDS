public class Endereco {
    private String rua;
    private String complemento;

    //Associação Unidirecional com cidade - Um endereço conhece uma cidade (é a linha de associação desenhada no diagrama)
    private Cidade cidade;

    //Construtores
    public Endereco() {
    }

    public Endereco(String rua, String complemento, Cidade cidade) {
        this.rua = rua;
        this.complemento = complemento;
        this.cidade = cidade;
    }

    //Getters
    public String getRua() {
        return rua;
    }

    public String getComplemento() {
        return complemento;
    }

    public Cidade getCidade() {
        return cidade;
    }

    //Setters
    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "rua='" + rua + '\'' +
                ", complemento='" + complemento + '\'' +
                ", cidade=" + cidade +
                '}';
    }
}
