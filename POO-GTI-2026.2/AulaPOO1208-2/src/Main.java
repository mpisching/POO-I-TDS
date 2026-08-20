
public class Main {
    public static void main(String[] args) {

        UnidadeCurricular unidadeCurricular = new UnidadeCurricular();

        unidadeCurricular.nome = "programação orientada objetos";
        unidadeCurricular.periodo = "noturno";
        unidadeCurricular.horario=1;
        unidadeCurricular.ch=80;
        unidadeCurricular.sala=4;

        System.out.println(
                "nome = "+unidadeCurricular.nome+
                        "\nperiodo = " +unidadeCurricular.periodo+
                        "\nhorário = " + unidadeCurricular.horario+
                        "\nCarga Horária = "+ unidadeCurricular.ch+
                        "\nSala = "+unidadeCurricular.sala
        );

        Aluno aluno = new Aluno();

    }
}