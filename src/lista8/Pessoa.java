package lista8;

public class Pessoa {
	protected String nome;
	protected String cpf;
	
	public Pessoa(String nome,String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public void mostrarDados() {
		System.out.printf("Nome: %s\nCPF: %s\n\n",nome,cpf);
	}
	
	public void mostrarDados(String palavra) {
		if(palavra.equalsIgnoreCase("Feliz")) {
			System.out.printf(":)\nNome: %s\nCPF: %s\n\n",nome,cpf);
		} else {
			System.out.printf("T-T\nNome: %s\nCPF: %s\n\n",nome,cpf);
		}
	}
}
