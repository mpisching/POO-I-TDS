public class Caneta {
   public String cor;
   public float ponta;
   public int carga = 100;
   public boolean tampada = true;

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
