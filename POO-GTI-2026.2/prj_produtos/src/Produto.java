public class Produto extends Object {
    public String nome;
    public String marca;
    public double preco;
    public int quantidade;
    public int limiteMaximo;

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
