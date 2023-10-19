package lista7;

public class Cabeca {
	private String corDoCabelo;
	private String tamanhoDaCabeca;
	public Cabeca(String corDoCabelo, String tamanhoDaCabeca) {
		this.corDoCabelo = corDoCabelo;
		this.tamanhoDaCabeca = tamanhoDaCabeca;
	}
	@Override
	public String toString() {
		return "Cabeça [corDoCabelo=" + corDoCabelo + ", tamanhoDaCabeca=" + tamanhoDaCabeca + "]";
	}
	
}
