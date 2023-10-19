package lista7;

public class Braco {
	private String tamanho;
	private int quantidadeDeBracos;
	public Braco(String tamanho, int quantidadeDeBracos) {
		this.tamanho = tamanho;
		this.quantidadeDeBracos = quantidadeDeBracos;
	}
	@Override
	public String toString() {
		return "Braco [comprimento=" + tamanho + ", ladoDominante=" + quantidadeDeBracos + "]";
	}
	
}
