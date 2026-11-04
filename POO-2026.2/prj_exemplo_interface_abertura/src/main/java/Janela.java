public abstract class Janela implements IAbertura {

    @Override
    public void travar() {
        System.out.println("Travando janela " + this.getClass().getSimpleName());
    }

    @Override
    public void destravar() {
        System.out.println("Destravando janela " + this.getClass().getSimpleName());
    }
}
