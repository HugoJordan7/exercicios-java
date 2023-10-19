package lista7;

public class Editora {
	private String nomeDaEditora;
	private String endereco;
	private String CNPJ;
	public Editora(String nomeDaEditora, String endereco, String CNPJ) {
		this.nomeDaEditora = nomeDaEditora;
		this.endereco = endereco;
		this.CNPJ = CNPJ;
	}
	@Override
	public String toString() {
		return "Editora [nomeDaEditora=" + nomeDaEditora + ", endereco=" + endereco + ", CNPJ=" + CNPJ + "]";
	}
	
}
