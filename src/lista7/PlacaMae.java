package lista7;

public class PlacaMae {
	private String processador;
	private String numeroDePortasDeConexao;
	private String dimensoes;
	private int quantDeSlotsDeMemoriaRAM;
	
	public PlacaMae(String processador, String numeroDePortasDeConexao, String dimensoes,int quantDeSlotsDeMemoriaRAM) {
		this.processador = processador;
		this.numeroDePortasDeConexao = numeroDePortasDeConexao;
		this.dimensoes = dimensoes;
		this.quantDeSlotsDeMemoriaRAM = quantDeSlotsDeMemoriaRAM;
	}

	@Override
	public String toString() {
		return "PlacaMae [processador=" + processador + ", numeroDePortasDeConexao=" + numeroDePortasDeConexao
				+ ", dimensoes=" + dimensoes + ", quantDeSlotsDeMemoriaRAM=" + quantDeSlotsDeMemoriaRAM + "]";
	}
}
