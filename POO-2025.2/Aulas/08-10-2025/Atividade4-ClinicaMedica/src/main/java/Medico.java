import java.util.ArrayList;
import java.util.List;

public class Medico {
    private String nome;
    private String cpf;
    private String especialidade;
    private String crm;

    //Associação Bidirecional com a classe Consulta
    //Um médico pode ter várias consultas (1, 0..*)
    private List<Consulta> consultas;

    //Construtor
    public Medico(String nome, String cpf, String especialidade, String crm) {
        this.nome = nome;
        this.cpf = cpf;
        this.especialidade = especialidade;
        this.crm = crm;
    //quem cuida dessa instanciação de consultas é o todo e isso eu coloco dentro do construtor
        this.consultas = new ArrayList<>();
    }
    //Metodo para adicionar consulta
    //Quando eu adiciono uma consulta a um médico, também atualizo o médico dentro da consulta.
    public void adicionarConsulta (Consulta consulta) {
        if (!consultas.contains(consulta));//Se a lista de consultas não tem essa consulta...
        this.consultas.add(consulta);//Adicione essa consulta dentro da lista
        consulta.setMedico(this);//Coloque o médico da consulta
    }

    //Get consulta - Na composição apenas o método get deve ser implementado para não quebrar a regra de negócio
    public List<Consulta> getConsulta(){
        return consultas;
    }

    //Getters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public String getCrm() {
        return crm;
    }

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", especialidade='" + especialidade + '\'' +
                ", crm='" + crm + '\'' +
                ", consultas=" + consultas +
                '}';
    }
}
