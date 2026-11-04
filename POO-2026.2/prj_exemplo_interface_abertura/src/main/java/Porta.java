public abstract class Porta implements IAbertura {
    @Override
    public void travar() {
        System.out.println("Travando porta " + this.getClass().getSimpleName());
    }
    @Override
    public void destravar() {
        System.out.println("Destravando porta " + this.getClass().getSimpleName());
    }
}
