package lista7;

public class Monitor {
	private String tipoDeTela;
	private String resolucao;
	private int taxaDeAtualizacaoDeTela;
	
	public Monitor(String tipoDeTela, String resolucao, int taxaDeAtualizacaoDeTela) {
		this.tipoDeTela = tipoDeTela;
		this.resolucao = resolucao;
		this.taxaDeAtualizacaoDeTela = taxaDeAtualizacaoDeTela;
	}

	@Override
	public String toString() {
		return "Monitor [tipoDeTela=" + tipoDeTela + ", resolucao=" + resolucao + ", taxaDeAtualizacaoDeTela="
				+ taxaDeAtualizacaoDeTela + "]";
	}
}
