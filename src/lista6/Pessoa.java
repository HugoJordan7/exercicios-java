package lista6;

public class Pessoa {
	private String nome;
	private String sobreNome;
	private int idade;
	private Carro carro;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome,String sobreNome,int idade) {
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.idade = idade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	
	public String getNome() {
		return nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public int getIdade() {
		return idade;
	}
	public Carro getCarro() {
		return carro;
	}
	
	public void ligarCarro() {
		carro.ligar();
	}
	public void desligarCarro() {
		carro.desligar();
	}
	public void frearCarro() {
		carro.frear();
	}
	public void acelerarCarro() {
		carro.acelerar();
	}

}
