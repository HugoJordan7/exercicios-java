package lista7Questao5;

public class Teclado {
	private String idioma;
	private int numeroDeTeclas;
	private String tipoDeConexao;
	
	public Teclado(String idioma, int numeroDeTeclas, String tipoDeConexao) {
		this.idioma = idioma;
		this.numeroDeTeclas = numeroDeTeclas;
		this.tipoDeConexao = tipoDeConexao;
	}
	
	@Override
	public String toString() {
		return "Teclado [idioma=" + idioma + ", numeroDeTeclas=" + numeroDeTeclas + ", tipoDeConexao=" + tipoDeConexao + "]";
	}
}
