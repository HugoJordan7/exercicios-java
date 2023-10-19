package lista7;

import java.util.Arrays;

public class Livro {
	private Titulo titulo;
	private Editora editora;
	private Capitulo[] capitulos;
	private Autor autor;
	public Livro(Titulo titulo, Editora editora, Capitulo[] capitulos, Autor autor) {
		this.titulo = titulo;
		this.editora = editora;
		this.capitulos = capitulos;
		this.autor = autor;
	}
	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", editora=" + editora + ", capitulos=" + Arrays.toString(capitulos)
				+ ", autor=" + autor + "]";
	}
	
}
