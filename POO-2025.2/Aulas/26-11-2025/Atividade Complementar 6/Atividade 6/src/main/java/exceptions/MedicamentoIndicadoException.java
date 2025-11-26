package exceptions;

@SuppressWarnings("serial")
public class MedicamentoIndicadoException extends Exception {

	public MedicamentoIndicadoException() {}
	
	public MedicamentoIndicadoException(String mensagem) {
		super(mensagem);
	}
}
