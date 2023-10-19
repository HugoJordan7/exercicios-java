package lista7Questao6;

public class Titulo {
	private String nomeDoTitulo;
	private String subTitulo;
	public Titulo(String nomeDoTitulo, String subTitulo) {
		this.nomeDoTitulo = nomeDoTitulo;
		this.subTitulo = subTitulo;
	}
	@Override
	public String toString() {
		return "Titulo [nomeDoTitulo=" + nomeDoTitulo + ", subTitulo=" + subTitulo + "]";
	}
}
