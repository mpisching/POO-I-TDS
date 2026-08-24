public class Caneta {
    public String marca;
    public String modelo;
    public String cor;
    public float ponta;
    public int carga = 100;

    public Caneta(String marca) {
        this.marca = marca;

    }

    public Caneta() {
        this.marca = null;
    }

    public Caneta(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    //Overload de Caneta() --> sobrecarga de método
    public Caneta(String marca, String modelo, String cor, float ponta) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
    }

    //    public Caneta (){
//
//    }

    public void pintar() {
        if (temCarga() && carga >= 5) {
            System.out.println(marca + " está pintando....");
            carga = carga - 5;
        }

    }

    public void escrever(String texto) {
        if (temCarga() && carga >= 3) {
            System.out.println(marca + " texto ... " + texto);
            carga -= 3;
        }
    }

    public void desenhar() {
        if (temCarga() && carga >= 1) {
            System.out.println(marca + " está desenhando....");
            carga -= 1;
        }
    }

    public int obterCarga() {
        return carga;
    }

    public boolean temCarga() {
        if (carga > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Caneta{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", ponta=" + ponta +
                ", carga=" + carga +
                '}';
    }
}
