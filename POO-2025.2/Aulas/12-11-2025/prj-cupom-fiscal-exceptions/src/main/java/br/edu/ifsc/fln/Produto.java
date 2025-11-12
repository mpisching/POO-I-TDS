package br.edu.ifsc.fln;

public class Produto {
    private String nome;
    private float valor;
    private static float margemLucro;

    public Produto(String nome, float valor) throws ProdutoException, Exception {
        this.nome = nome;
        this.setValor(valor);
    }

    public float calcularPrecoVenda() {
        return valor + (valor * margemLucro / 100);
    }

    public static float getMargemLucro() {
        return margemLucro;
    }

    public static void setMargemLucro(float margemLucro) {
        Produto.margemLucro = margemLucro;
    }

    public float getValor() {
        return valor;
    }

    //    public void setValor(float valor) throws Exception {
//        if (valor >= 0.0F) {
//            this.valor = valor;
//        } else {
//            throw new Exception("valor invalido");
//        }
//    }
    public void setValor(float valor) throws ProdutoException, Exception {
        if (valor >= 0.0F) {
            this.valor = valor;
        } else {
            throw new ProdutoException("valor invalido");
        }
        throw new Exception("falha provacada  ...");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }
}
