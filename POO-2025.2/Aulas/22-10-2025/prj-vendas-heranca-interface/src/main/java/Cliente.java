import java.io.Serializable;
import java.time.LocalDate;

public class Cliente implements IResumoDados {
    private int id;
    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;
    private LocalDate dataNascimento;

    public Cliente() {
    }

    public Cliente(int id, String nome, String cpf, String telefone, String endereco, LocalDate dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String getDados() {
        StringBuilder dados = new StringBuilder();
        dados.append("Nome..........: ").append(nome).append("\n");
        dados.append("CPF...........: ").append(cpf).append("\n");
        dados.append("Telefone......: ").append(telefone).append("\n");
        dados.append("Endereco......: ").append(endereco).append("\n");
        dados.append("DataNascimento: ").append(dataNascimento).append("\n");
        return dados.toString();
    }

    @Override
    public String getDados(String msg) {
        StringBuilder dados = new StringBuilder();
        dados.append(getDados());
        dados.append("Mensagem: ").append(msg).append("\n");
        return dados.toString();
    }
}
