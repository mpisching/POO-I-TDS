public class Caneta {
    public String marca;
    public String cor;
    public float ponta;
    public int carga = 100;
    public boolean tampada = true;

    public Caneta() {

    }

    public Caneta(String marca, String cor, float ponta, int carga, boolean tampada) {
        this.marca = marca;
        this.cor = cor;
        this.ponta = ponta;
        this.carga = carga;
        this.tampada = tampada;
    }

    public Caneta(String marca, String cor) {
        this.marca = marca;
        this.cor = cor;
    }

    public Caneta(String cor) {
        this.cor = cor;
    }

    public Caneta(String cor, float ponta) {
        this.cor = cor;
        this.ponta = ponta;
    }

//   public Caneta() {
//       //this.cor = null;
//       //this.ponta = 0.0f;
//   }

    public void escrever(String msg) {
        if (tampada == false) {
            System.out.println("Caneta escrevendo ... " + msg);
            consumirCarga(1);
        } else {
            System.out.println("Caneta está tampada");
        }

    }

    public void pintar() {
        if (tampada == false) {
            System.out.println("Caneta Pintando...");
            consumirCarga(2);
        } else {
            System.out.println("não é possível pintar com a caneta tampada");
        }

    }

    public void tampar() {
        this.tampada = true;
        System.out.println("Caneta tampada");
    }

    public void destampar() {
        this.tampada = false;
        System.out.println("Caneta destampada");
    }

    private void consumirCarga(int qtde) {
        carga -= qtde;
        //carga = carga - qtde;
    }

    @Override
    public String toString() {
        return "Caneta{" +
                "cor='" + cor + '\'' +
                ", ponta=" + ponta +
                ", carga=" + carga +
                ", tampada=" + tampada +
                '}';
    }
}
