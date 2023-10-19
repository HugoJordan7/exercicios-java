package lista7;

public class Capitulo {
	private int paginaInicial;
	private String nomeDoCapitulo;
	public Capitulo(int paginaInicial, String nomeDoCapitulo) {
		this.paginaInicial = paginaInicial;
		this.nomeDoCapitulo = nomeDoCapitulo;
	}
	@Override
	public String toString() {
		return "Capitulo [numeroDoCapitulo=" + paginaInicial + ", nomeDoCapitulo=" + nomeDoCapitulo + "]";
	}
}
