public class Produto {
    private int id;
    private String nome;
    private String descricao;
    private double preco;

    private Categoria categoria; //associacao simples unidirecional

    private Fornecedor fornecedor;//multiplicidade - Produto possuir um Fornecedor

    //private Estoque estoque = new Estoque(); //na composição o estoque já será criado com o produto
    //segunda forma de implementação da composição
    private Estoque estoque;

    //private int id_categoria; //CRIME CONTRA A POO

    public Produto() {
        estoque = new Estoque();
    }

    public Produto(int id, String nome, String descricao, double preco, Categoria categoria) {
        this();
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
    }

    public Produto(int id, String nome, String descricao, double preco, Categoria categoria, Fornecedor fornecedor) {
        this();
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
        this.fornecedor = fornecedor;
    }

    public Produto(int id, String nome, String descricao, double preco, Categoria categoria, Fornecedor fornecedor, int qtdMinima, int qtdMaxima) {
//        this.estoque = new Estoque();
//        this.estoque.setQtdMinima(qtdMinima);
//        this.estoque.setQtdMaxima(qtdMaxima);
        this.estoque = new Estoque(qtdMaxima, qtdMinima);
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
        this.fornecedor = fornecedor;
        this.estoque = estoque;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
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

    public Estoque getEstoque() {
        return estoque;
    }

    //não deve ser implementado para atributos que representam composição
//    public void setEstoque(Estoque estoque) {
//        this.estoque = estoque;
//    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", categoria=" + categoria +
                ", fornecedor=" + fornecedor.getNome() +
                '}';
    }
}
