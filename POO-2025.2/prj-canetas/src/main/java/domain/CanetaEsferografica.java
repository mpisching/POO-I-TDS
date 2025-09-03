package domain;

public class CanetaEsferografica  extends Caneta {

    public String getDados() {
        String str = Double.toString(preco);
        return str;
    }
}
