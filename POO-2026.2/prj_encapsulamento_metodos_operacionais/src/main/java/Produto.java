public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    private int limiteMaximo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        } else {
            throw new RuntimeException("quantidade não permitida ... corrija...");
        }
//        else {
//            System.out.println("quantidade não permitida ... corrija...");
//        }
    }

    public int getLimiteMaximo() {
        return limiteMaximo;
    }

    public void setLimiteMaximo(int limiteMaximo) {
        this.limiteMaximo = limiteMaximo;
    }

    public void repor(int quantidade) {
        //this.quantidade = this.quantidade + quantidade;
        if (this.quantidade + quantidade <= limiteMaximo) {
            this.quantidade += quantidade;
        } else {
            throw new IllegalArgumentException(
                    "A quantidade inserida não pode ultrapassar o limite máximo do estoque.");
        }
    }

    public void retirar(int quantidade) {
        if (this.quantidade - quantidade >= 0) {
            this.quantidade -= quantidade;
        } else {
            throw new IllegalArgumentException(
                    "A quantidade retirada não pode ser maior que a quantidade atual do estoque");
        }
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
