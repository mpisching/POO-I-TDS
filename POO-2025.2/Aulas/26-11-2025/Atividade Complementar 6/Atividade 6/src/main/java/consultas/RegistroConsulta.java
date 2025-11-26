package consultas;

import java.util.ArrayList;
import java.util.List;

import exceptions.MedicamentoIndicadoException;

public class RegistroConsulta {

	private String descricao;
	//private Consulta consulta;
	private List<HistoricoMedicacao> listaMedicamentos = new ArrayList<>();
	
	public RegistroConsulta() {
		super();
	}

	public RegistroConsulta(String descricao, Consulta consulta) {
		super();
		this.descricao = descricao;
	//	this.consulta = consulta;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
//	public Consulta getConsulta() {
//		return consulta;
//	}
//
//	public void setConsulta(Consulta consulta) {
//		this.consulta = consulta;
//	}

	public List<HistoricoMedicacao> getListaMedicamentos() {
		return listaMedicamentos;
	}

	public void adicionarMedicamento(String descricao, Medicamento medicamento) throws MedicamentoIndicadoException{
		HistoricoMedicacao historico = new HistoricoMedicacao(descricao, medicamento);
		if(medicamento.getNome() == null | medicamento.getFabricante() == null | descricao == null) {
			throw new MedicamentoIndicadoException("Informação inválida quanto ao nome/fabricante do medicamento");
		}
		else {
			listaMedicamentos.add(historico);
		}
	}
}
