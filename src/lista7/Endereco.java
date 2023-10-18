package lista7;

public class Endereco {
	private String logradouro;
	private int numero;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	
	public Endereco(String logradouro, int numero, String bairro, String cidade, String estado, String cep) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}
	
	public String getEnderecoToString() {
		return "Logradouro: " + logradouro + "\nNúmero: " + numero + "\nBairro: "+ bairro + "\nCidade: "+cidade+"\nEstado: "+estado +"\nCEP: "+cep;
	}
}
