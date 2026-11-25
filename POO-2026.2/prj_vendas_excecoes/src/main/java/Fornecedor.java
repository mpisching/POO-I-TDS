import java.util.ArrayList;
import java.util.List;

/**
 * @author Marcos Pisching
 * @version 1.0
 * @since 2026
 * Esta classe representa a entidade Fornecedor de um sistema de Vendas
 */
public abstract class Fornecedor extends Object implements IResumoDados {
    protected int id;
    protected String nome;
    protected String email;
    protected String fone;

    private List<Produto> produtos = new ArrayList<>();

    public Fornecedor() {
    }

    public Fornecedor(int id, String nome, String email, String fone) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.fone = fone;
    }

    /**
     * Método para obter o id do fornecedor
     * @return int que é o id do fornecedor
     */
    public int getId() {
        return id;
    }


    /**
     * Método para definir o id de um fornecedor
     * @param id int
     */
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
        if (produto.getFornecedor() == null) {
            produtos.add(produto);
            produto.setFornecedor(this);
        } else {
            throw new RuntimeException("Operação Inválida - O produto já possui fornecedor.");
        }
    }

    public void remove(Produto produto) {
        produtos.remove(produto);
        produto.setFornecedor(null);
    }

    public void transferir(Fornecedor novoFornecedor, Produto produto) {
        this.produtos.remove(produto);
        novoFornecedor.getProdutos().add(produto);
        produto.setFornecedor(novoFornecedor);
    }

    public String getDados() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome............: " + nome + "\n");
        sb.append("E-mail..........: " + email + "\n");
        sb.append("Fone............: " + fone + "\n");
        sb.append("***** Produtos ***** " + "\n");
        int i = 0;
        if (produtos.isEmpty()) {
            sb.append("Lista de produtos vazia\n");
        } else {
            for (Produto produto : produtos) {
                sb.append((++i) + " - " + produto.getNome() +
                        " - " + produto.getCategoria().getDescricao() + "\n");
            }
        }
        return sb.toString();
    }

}
