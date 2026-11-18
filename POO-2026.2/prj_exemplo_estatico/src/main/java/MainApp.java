public class MainApp {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.nome = "Fulano";
        f1.salario = 10000;
        Funcionario.valeRefeicao = 500;

        Funcionario f2 = new Funcionario();
        f2.nome = "Cicrano";
        f2.salario = 12000;
        Funcionario.valeRefeicao = 5000;

        print(f1);
        print(f2);

    }

    public static void print(Funcionario f) {
        System.out.println("Nome: " + f.nome);
        System.out.println("Salario: " + f.salario);
        System.out.println("Vale Refeição: " + f.valeRefeicao);

    }
}
