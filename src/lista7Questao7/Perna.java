package lista7Questao7;

public class Perna {
	private String comprimento;
	private String tamanhoDosPes;
	public Perna(String comprimento, String tamanhoDosPes) {
		this.comprimento = comprimento;
		this.tamanhoDosPes = tamanhoDosPes;
	}
	@Override
	public String toString() {
		return "Perna [comprimento=" + comprimento + ", tamanhoDoCalcado=" + tamanhoDosPes + "]";
	}
	
}
