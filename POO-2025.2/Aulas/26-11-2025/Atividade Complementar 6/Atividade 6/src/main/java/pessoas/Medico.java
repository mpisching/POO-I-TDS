package pessoas;

import java.util.ArrayList;
import java.util.List;

import agendamento.IAgendavel;
import consultas.Consulta;

public class Medico extends Pessoa implements IAgendavel {

	private String especialidade, crm;
	private List<Consulta> consultas = new ArrayList<>();
	
	public Medico() {
		super();
	}

	public Medico(String nome, String cpf, String especialidade, String crm) {
		super(nome, cpf);
		this.especialidade = especialidade;
		this.crm = crm;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}
	
	public List<Consulta> getConsultas() {
		return consultas;
	}

	public void setConsultas(List<Consulta> consultas) {
		this.consultas = consultas;
	}

	public void adicionarConsulta(Consulta consulta) {
		consultas.add(consulta);
		consulta.setMedico(this);
	}
	
	public void agendarConsulta(Consulta consulta) {
		consultas.add(consulta);
	}
	
	@Override
	public void exibirInformacoes() {
		System.out.println("Nome_________: "+this.getNome());
		System.out.println("CPF__________: "+this.getCpf());
		System.out.println("CRM__________: "+this.getCrm());
		System.out.println("Especialidade: "+this.getEspecialidade());
	}
	
}
