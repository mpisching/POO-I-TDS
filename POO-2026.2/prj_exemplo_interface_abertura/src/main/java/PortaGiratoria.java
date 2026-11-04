public class PortaGiratoria extends Porta{
    @Override
    public void abrir() {
        System.out.println("Abrindo porta giratória...");
    }
    @Override
    public void fechar() {
        System.out.println("Fechando porta giratória...");
    }

    @Override
    public void travar() {
        super.travar();
        System.out.println("Travando eixo central do porta giratória...");
    }
}
