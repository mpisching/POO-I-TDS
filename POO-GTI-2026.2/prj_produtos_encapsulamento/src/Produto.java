public class Produto extends Object {
    private String nome;
    private String marca;
    private double preco;
    private int quantidade;
    private int limiteMaximo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade > 0) {
            this.quantidade = quantidade;
        } else {
            //lançamento de exceção
            throw new IllegalArgumentException("a quantidade não pode ser <= 0");
            //System.out.println("a quantidade não pode ser <= 0");
        }

    }

    public int getLimiteMaximo() {
        return limiteMaximo;
    }

    public void setLimiteMaximo(int limiteMaximo) {
        this.limiteMaximo = limiteMaximo;
    }

    public void repor(int quantidade) {
        //this.quantidade = this.quantidade + quantidade;
        if (this.quantidade + quantidade <= this.limiteMaximo) {
            this.quantidade += quantidade;
        } else {
            throw new IllegalArgumentException(
                    "O estoque não suporta a quantidade informada.");
        }
    }

    public void retirar(int quantidade) {
        if (this.quantidade - quantidade >= 0) {
            this.quantidade -= quantidade;
        } else {
            throw new IllegalArgumentException(
                    "A quantidade informada não pode ser maior que a quantidade em estoque "
                    + this.quantidade);
        }
    }

    public Produto() {}
    //Overloading - sobrecarga de método
    public Produto(String nome) {
        this.nome = nome;
        preco = 0.0;
        quantidade = 0;
        limiteMaximo = 0;
    }

    public Produto(String nome, String marca) {
        this.nome = nome;
        this.marca = marca;
        preco = 0.0;
        quantidade = 0;
        limiteMaximo = 0;
    }

    public Produto(String nome, String marca, double preco, int quantidade, int limiteMaximo) {
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
        this.quantidade = quantidade;
        this.limiteMaximo = limiteMaximo;
    }

    public Produto(int quantidade, int limiteMaximo) {
        this.quantidade = quantidade;
        this.limiteMaximo = limiteMaximo;
    }



    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                ", limiteMaximo=" + limiteMaximo +
                '}';
    }
}
