package pessoas;

import java.util.ArrayList;
import java.util.List;

import agendamento.IAgendavel;
import consultas.Consulta;
import consultas.Medicamento;
import informacoes.pessoais.Cidade;
import informacoes.pessoais.Endereco;

public class Paciente extends Pessoa implements IAgendavel {

	private String contato, rua;
	private Endereco endereco;
	private Consulta consulta;
	private List<Medicamento> historico;
	private List<Consulta> consultas;
	
	public Paciente() {
		super();
		this.historico = new ArrayList<>();
		this.consultas = new ArrayList<>();
	}

	public Paciente(String contato) {
		super();
		this.contato = contato;
		this.historico = new ArrayList<>();
		this.consultas = new ArrayList<>();
	}
	
	public Paciente(String nome, String cpf, String contato, String rua, Cidade cidade) {
		super(nome, cpf);
		this.contato = contato;
		this.endereco = new Endereco(rua, cidade);
		this.historico = new ArrayList<>();
		this.consultas = new ArrayList<>();
	}
	
	public String getRua() {
		return rua;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}
	
	public Consulta getConsulta() {
		return consulta;
	}

	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}

	public List<Consulta> getConsultas() {
		return consultas;
	}

	public void setConsultas(List<Consulta> consultas) {
		this.consultas = consultas;
	}

	public void adicionarHistorico(Medicamento medicamento) {
		historico.add(medicamento);
	}
	
	public void agendarConsulta(Consulta consulta) {
		consultas.add(consulta);
	}
	
	@Override
	public void exibirInformacoes() {
		System.out.println("Nome____: "+this.getNome());
		System.out.println("CPF_____: "+this.getCpf());
		System.out.println("Contato_: "+this.getContato());
		System.out.println("Endereço: "+this.getEndereco().getRua()+" - "+this.getEndereco().getCidade().getNome()+", "+this.getEndereco().getCidade().getUf());
	}
	
}
