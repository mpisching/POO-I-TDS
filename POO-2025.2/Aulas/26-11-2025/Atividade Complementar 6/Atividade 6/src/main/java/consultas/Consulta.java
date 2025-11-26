package consultas;

import agendamento.EPrioridade;
import agendamento.IAgendavel;
import pessoas.Medico;
import pessoas.Paciente;

public class Consulta {

	private String data, horario;
	private EPrioridade prioridade;
	private Paciente paciente;
	private Medico medico;
	private RegistroConsulta registroConsulta;
	
	//public Consulta() {
	//	super();
	//}

	public Consulta(String data, String horario, Medico medico, Paciente paciente, EPrioridade prioridade, String descricaoRegistro) {
		super();
		this.data = data;
		this.horario = horario;
		this.prioridade = prioridade;
		this.medico = medico;
		this.paciente = paciente;
        this.registroConsulta = new RegistroConsulta(descricaoRegistro, null);
	}
	
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public EPrioridade getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(EPrioridade prioridade) {
		this.prioridade = prioridade;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	
	public RegistroConsulta getRegistroConsulta() {
		return registroConsulta;
	}

	//public void setRegistroConsulta(RegistroConsulta registroConsulta) {
	///	this.registroConsulta = registroConsulta;
	//}
	
}
