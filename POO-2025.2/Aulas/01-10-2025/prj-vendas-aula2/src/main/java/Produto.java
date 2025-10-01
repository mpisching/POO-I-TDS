public class Produto {
    private int id;
    private String nome;
    private String descricao;
    private float preco;
    //associação unidirecional entre Produto e Categoria (*..1)
    private Categoria categoria;

    private Estoque estoque = new Estoque();

    public Produto() {
    }

    public Produto(int id, String nome, String descricao, float preco, Categoria categoria) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
    }

    public Produto(int id, String nome, String descricao, float preco, Categoria categoria, int quantidade, int qtdMinima, int qtdMaxima) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
        this.estoque = new Estoque(quantidade, qtdMinima, qtdMaxima);
    }

    public Estoque getEstoque() {
        return estoque;
    }

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

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", categoria=" + categoria +
                '}';
    }
}
