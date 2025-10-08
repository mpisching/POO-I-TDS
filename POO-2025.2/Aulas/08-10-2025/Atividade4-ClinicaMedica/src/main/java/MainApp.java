public class MainApp {
    public static void main(String[] args){
        Cidade cidade1 = new Cidade("Florianópolis", "SC");
        Cidade cidade2 = new Cidade();
        cidade2.setNome("São Paulo");
        cidade2.setUf("SP");

        Paciente p1 = new Paciente("Cláudia", "12345678912","Alves de Brito", "427",cidade1);
        Paciente p2 = new Paciente("Maurício", "23456789123", "Paulista", "2073", cidade2);

        Medico m1 = new Medico("Dr. Henrique", "98765432198", "Cardiologista","147258/SC");
        Medico m2 = new Medico("Dra. Gabriela", "65432198732", "Dermatologista", "369258/SC");

        Consulta c1 = new Consulta("2025-10-07", "10:00", p1, EPrioridade.BAIXA,m2);
        Consulta c2 = new Consulta("2025-10-08", "9:00", p2, EPrioridade.ALTA,m1);

        m1.adicionarConsulta(c2);
        m1.adicionarConsulta(c1);

//        System.out.println("* PACIENTES *");
//        System.out.println(p1.getNome() + " | Cidade: " + p1.getEndereco().getCidade().getNome() + " | UF: " + p1.getEndereco().getCidade().getUf());
//        System.out.println(p2.getNome() + " | Cidade: " + p2.getEndereco().getCidade().getNome() + " | UF: " + p1.getEndereco().getCidade().getUf());
//
//        System.out.println("\n* MÉDICOS *");
//        System.out.println(m1.getNome() + " | Especialidade: " + m1.getEspecialidade());
//        System.out.println(m2.getNome() + " | Especialidade: " + m2.getEspecialidade());
//
//        System.out.println("\n* CONSULTAS *");
//        System.out.println(c1);
//        System.out.println(c2);

        System.out.println("Nome da cidade do paciente de uma consulta...");
        System.out.println(m1.getConsulta().get(0).getPaciente().
                getEndereco().getCidade().getNome());


    }
}
