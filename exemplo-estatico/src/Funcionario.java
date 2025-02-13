public class Funcionario {

    private int matricula;
    private String nome;
    private float salarioBase;
    private static float valeRefeicao;

    public Funcionario(int matricula, String nome, float salarioBase/*, float valeRefeicao*/) {
        this.matricula = matricula;
        this.nome = nome;
        this.salarioBase = salarioBase;
        //this.valeRefeicao = valeRefeicao;
    }

    public Funcionario() {
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public static float getValeRefeicao() {
        return valeRefeicao;
    }

    public static void setValeRefeicao(float valeRefeicao) {
        Funcionario.valeRefeicao = valeRefeicao;
    }

    public float calcularSalarioLiquido() {
        return salarioBase + valeRefeicao;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", salarioBase=" + salarioBase +
                ", valeRefeicao=" + valeRefeicao +
                ", salario Liquido=" + calcularSalarioLiquido() +
                '}';
    }
}
