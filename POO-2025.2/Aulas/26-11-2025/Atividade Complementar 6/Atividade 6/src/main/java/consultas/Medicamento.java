package consultas;

public class Medicamento {

	private String nome, fabricante;
	
	public Medicamento() {
		super();
	}

	public Medicamento(String nome, String fabricante) {
		super();
		this.nome = nome;
		this.fabricante = fabricante;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	
}
