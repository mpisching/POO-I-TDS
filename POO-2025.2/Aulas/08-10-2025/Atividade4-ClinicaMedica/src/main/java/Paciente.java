public class Paciente {
    private String nome;
    private String cpf;

    //Associação com Composição com a classe Endereço - paciente conhece o endereço
    //Não dá para criar um Paciente sem já dar os dados para criar também seu Endereço por ser Composição
    private Endereco endereco;

    //Construtor
    public Paciente(String nome, String cpf, String rua, String complemento, Cidade cidade) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = new Endereco(rua,complemento,cidade);// Aqui o paciente cria automaticamente o endereço dele
    }

    //Getters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    //Setters - não tem set para endereço
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void atualizarEndereco(String rua, String complemento, Cidade cidade) {
        if (endereco != null) {
            endereco.setRua(rua);
            endereco.setComplemento(complemento);
            endereco.setCidade(cidade);
        } else {
            endereco = new Endereco(rua,complemento,cidade);
        }
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}