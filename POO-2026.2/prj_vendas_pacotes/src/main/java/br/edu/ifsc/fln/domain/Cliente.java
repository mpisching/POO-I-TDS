package br.edu.ifsc.fln.domain;

import java.time.LocalDate;

public class Cliente implements IResumoDados {

    private int id;
    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;
    private LocalDate dataNascimento;

    public Cliente(String nome) {
        this.nome = nome;
    }

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

    public String getDados() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dados do br.edu.ifsc.fln.domain.Cliente\n");
        sb.append("Nome............: ").append(nome).append("\n");
        sb.append("CPF.............: ").append(cpf).append("\n");
        sb.append("Fone............: ").append(telefone).append("\n");
        sb.append("Endereço........: ").append(endereco).append("\n");
        sb.append("Data Nascimento.: ").append(dataNascimento).append("\n");
        return sb.toString();
    }

    public String getDados(String msg) {
        StringBuilder sb = new StringBuilder();
        sb.append(getDados());
        sb.append("Mensagem: " ).append(msg).append("\n");
        return sb.toString();
    }
}
