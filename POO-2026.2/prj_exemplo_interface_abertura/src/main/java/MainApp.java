import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        //IAbertura abertura = new IAbertura();
        List<IAbertura> aberturas  = new ArrayList<>();

        IAbertura janelaCorrer = new JanelaCorrer();

        //janelaCorrer.abrir();
        //janelaCorrer.fechar();

        IAbertura janelaBasculante = new JanelaBasculante();
        //janelaBasculante.abrir();
        //janelaBasculante.fechar();

        IAbertura portaCorrer = new PortaCorrer();
        IAbertura portaGiratoria = new PortaGiratoria();
        IAbertura portaConvencional = new PortaConvencional();

        aberturas.add(janelaCorrer);
        aberturas.add(janelaBasculante);
        aberturas.add(portaCorrer);
        aberturas.add(portaGiratoria);
        aberturas.add(portaConvencional);

        //abrirJanelas(aberturas);
        //abrirPortas(aberturas);

        //abrirAberturas(aberturas);
        fecharAberturas(aberturas);
    }

    public static void fecharAberturas(List<IAbertura> aberturas) {
        for (IAbertura abertura : aberturas) {
            abertura.fechar();
            abertura.travar();
        }
    }

    public static void abrirAberturas(List<IAbertura> aberturas) {
        for (IAbertura abertura : aberturas) {
            abertura.abrir();
        }
    }

    public static void abrirJanelas(List<IAbertura> aberturas) {
        for (IAbertura abertura : aberturas) {
            if (abertura instanceof Janela) {
                abertura.abrir();
            }
        }
    }

    public static void abrirPortas(List<IAbertura> aberturas) {
        for (IAbertura abertura : aberturas) {
            if (abertura instanceof Porta) {
                abertura.abrir();
            }
        }
    }


}
