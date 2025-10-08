public class Consulta {
    private String dataConsulta;
    private String horario;

    //Associação Unidirecional com a classe Paciente e com Prioridade
    private Paciente paciente;
    private EPrioridade prioridade;

    //Associação Bidirecional com a classe Medico
    private Medico medico;

    //Construtor
    public Consulta(String dataConsulta, String horario, Paciente paciente, EPrioridade prioridade, Medico medico) {
        this.dataConsulta = dataConsulta;
        this.horario = horario;
        this.paciente = paciente;
        this.prioridade = prioridade;
        this.medico = medico;
    }

    //Getters
    public String getDataConsulta() {
        return dataConsulta;
    }

    public String getHorario() {
        return horario;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public EPrioridade getPrioridade() {
        return prioridade;
    }

    public Medico getMedico() {
        return medico;
    }

    //Setters

    public void setDataConsulta(String dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setPrioridade(EPrioridade prioridade) {
        this.prioridade = prioridade;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    @Override
    public String toString() {
        return "Consulta: " +
                "dia: " + dataConsulta +
                ", horário: " + horario +
                ", paciente: " + paciente.getNome() +
                ", prioridade: " + prioridade +
                ", médico: " + medico.getNome() + " " + medico.getEspecialidade();
    }
}
