package lista7;

public class Olho {
	private String cor;
	private int quantidade;
	public Olho(String cor, int quantidade) {
		this.cor = cor;
		this.quantidade = quantidade;
	}
	@Override
	public String toString() {
		return "Olho [cor=" + cor + ", quantidade=" + quantidade + "]";
	}
	
}
