package lista8;

public class Cliente extends Pessoa{
	protected int codigo;
	
	public Cliente(String nome,String cpf,int codigo) {
		super(nome,cpf);
		this.codigo = codigo;
	}
	
	public void mostrarDados() {
		System.out.printf("Nome: %s\nCPF: %s\nCódigo: %s\n\n",nome,cpf,codigo);
	}
	
	public void mostrarDados(String palavra) {
		if(palavra.equalsIgnoreCase("Feliz")) {
			System.out.printf(":)\nNome: %s\nCPF: %s\nCódigo: %s\n\n",nome,cpf,codigo);
		} else {
			System.out.printf("T-T\nNome: %s\nCPF: %s\nCódigo: %s\n\n",nome,cpf,codigo);
		}
	}
}
