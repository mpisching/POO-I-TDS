import java.math.BigDecimal;

public class Produto {
    private int id;
    private String nome;
    private String descricao;
    private BigDecimal preco;

    private Categoria categoria; // -> associação unidirecional

    private Fornecedor fornecedor; // necessário para declaração de associação bidirecional

    private Estoque estoque; //associação

    public Produto() {
        //createEstoque();
        this.estoque = new Estoque();//caracteriza a composição. O objeto estoque é instanciado e gerido pelo Produto
    }

//    private void createEstoque() {
//        this.estoque = new Estoque();
//    }

    public Produto(int id, String nome, String descricao, BigDecimal preco) {
        //this.estoque = new Estoque();
        this();
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public Produto(int id, String nome, String descricao, BigDecimal preco, Categoria categoria) {
        this(id, nome, descricao, preco);
//        this.id = id;
//        this.nome = nome;
//        this.descricao = descricao;
//        this.preco = preco;
        this.categoria = categoria;
    }

    public Produto(int id, String nome, String descricao, BigDecimal preco, Categoria categoria,
                   int qtdMaxima, int qtdMinima) {
//        this(id, nome, descricao, preco);
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
        this.estoque = new Estoque(qtdMaxima, qtdMinima);
    }


    public Estoque getEstoque() {
        return estoque;
    }

    //não é aceitável quando se trata de associação por composição,
    //pelo fato do método aceitar um parâmetro do tipo Estoque que atualiza a variável de referência estoque,
    // que é um atributo de Produto utilizado para implementar a composição.
//    public void setEstoque(Estoque estoque) {
//        this.estoque = estoque;
//    }

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", categoria=" + categoria +
                ", Fornecedor=" + fornecedor.getNome() +
                '}';
    }
}


