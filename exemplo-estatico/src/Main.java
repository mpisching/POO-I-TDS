public class Main {
    public static void main(String[] args) {
        Funcionario.setValeRefeicao(200.0f);//forma correta
        Funcionario f1 = new Funcionario(1, "Fulano",
                2000.0F);
        //f1.setValeRefeicao(100);//forma indesejável
        Funcionario f2 = new Funcionario(2, "Ciclano",
                12000.0F);
        Funcionario f3 = new Funcionario(3, "Beltrano",
                20000.0F);
        Funcionario f4 = new Funcionario(4, "Deltrano",
                122000.0F);
        //Funcionario.setValeRefeicao(300.0f);

        Main main = new Main();
        main.print(f1);
        main.print(f2);
        main.print(f3);
        main.print(f4);
    }

    public void print(Funcionario f) {
        System.out.println("Funcionario: " + f);
    }
}