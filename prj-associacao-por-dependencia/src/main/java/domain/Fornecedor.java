package domain;


import java.util.ArrayList;
import java.util.List;

public abstract class Fornecedor extends Object implements IResumoDados {
    private int id;
    private String nome;
    private String email;
    private String fone;

    private List<Produto> produtos = new ArrayList<>();

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void add(Produto produto) {
        this.produtos.add(produto);
        produto.setFornecedor(this);
    }

    public void remove(Produto produto) {
        this.produtos.remove(produto);
        produto.setFornecedor(null);
    }

    @Override
    public String getDados() {
        StringBuilder dados = new StringBuilder();
        dados.append("ID...........: ").append(this.getId()).append("\n");
        dados.append("Nome.........: ").append(this.getNome()).append("\n");
        dados.append("Email........: ").append(this.getEmail()).append("\n");
        dados.append("Fone.........: ").append(this.getFone()).append("\n");
        return dados.toString();
    }

    @Override
    public String getDados(String msg) {
        StringBuilder dados = new StringBuilder();
        dados.append(getDados()).append("\n").append("Mensagem: ").append(msg);
        return dados.toString();
    }

    public String getDadosProdutos() {
        StringBuilder dados = new StringBuilder();
        dados.append("Lista de produtos:\n");
        if (this.produtos != null && !this.produtos.isEmpty()) {
            for (Produto produto : this.produtos) {
                dados.append("Nome - ").append(produto.getNome())
                        .append(" - ").append(produto.getCategoria().getDescricao())
                        .append("\n");
            }
        } else {
            dados.append("Nenhum produto encontrado\n");
        }
        dados.append("\n");
        return dados.toString();
    }
}
