package consultas;

public class HistoricoMedicacao {

	private String descricao;
	private RegistroConsulta registroConsulta;
	private Medicamento medicamento;
	
	public HistoricoMedicacao() {
		super();
	}

	public HistoricoMedicacao(String descricao, Medicamento medicamento) {
		super();
		this.descricao = descricao;
		this.medicamento = medicamento;
	}

	public HistoricoMedicacao(RegistroConsulta registroConsulta, Medicamento medicamento, String descricao) {
		super();
		this.registroConsulta = registroConsulta;
		this.medicamento = medicamento;
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setRegistroConsulta(RegistroConsulta registroConsulta) {
		this.registroConsulta = registroConsulta;
	}

	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}

	public RegistroConsulta getRegistroConsulta() {
		return registroConsulta;
	}

	public Medicamento getMedicamento() {
		return medicamento;
	}
	
}
