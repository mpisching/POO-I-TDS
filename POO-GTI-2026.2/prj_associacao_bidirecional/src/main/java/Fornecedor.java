import java.util.ArrayList;
import java.util.List;

public class Fornecedor {
    private int id;
    private String nome;
    private String email;
    private String fone;

    public Fornecedor() {
    }

    public Fornecedor(int id, String nome, String email, String fone) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.fone = fone;
    }

    //private Produto produto1;//representa associação bidirecional de multiplicidade 1
    //private Produto[] produtos = new Produto[10000];//resolve em partes ... não é uma boa prática de programação
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
        produtos.add(produto);
        produto.setFornecedor(this);
    }

    public void remove(Produto produto) {
        produtos.remove(produto);
        produto.setFornecedor(null);
    }

    public String getDados() {
        StringBuilder sb = new StringBuilder();
        sb.append("**** Dados do Fornecedor ****\n");
        sb.append("Nome........: " + nome + "\n");
        sb.append("Lista de produtos\n");
        if (produtos.isEmpty()) {
            sb.append("Lista de produtos vazia\n");
        } else {
            int cont = 0;
            for (Produto produto : produtos) {
                sb.append((++cont) + " - " + produto.getNome() + "\n");
            }
        }

        return sb.toString();
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", fone='" + fone + '\'' +
                ", produtos=" + produtos +
                '}';
    }
}
