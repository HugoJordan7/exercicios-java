package lista6;

public class Memoria {
	private String tamanho;
	private String tipoDeTecnologia;
	private String leitura;
	private String gravacao;
	
	public Memoria(String tamanho, String tipoDeTecnologia, String leitura, String gravacao) {
		this.tamanho = tamanho;
		this.tipoDeTecnologia = tipoDeTecnologia;
		this.leitura = leitura;
		this.gravacao = gravacao;
	}

	@Override
	public String toString() {
		return "Memoria [tamanho=" + tamanho + ", tipoDeTecnologia=" + tipoDeTecnologia + ", leitura=" + leitura
				+ ", gravacao=" + gravacao + "]";
	}
}
