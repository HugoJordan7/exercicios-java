package lista8;

public class Funcionario extends Pessoa {
	protected String matricula;
	protected double salario;
	
	public Funcionario(String nome,String cpf,String matricula,double salario) {
		super(nome,cpf);
		this.matricula = matricula;
		this.salario = salario;
	}
	
	public void mostrarDados() {
		System.out.printf("Nome: %s\nCPF: %s\nMatrícula: %s\nSalario: %s\n\n",nome,cpf,matricula,salario);
	}
	
	public void mostrarDados(String palavra) {
		if(palavra.equalsIgnoreCase("Feliz")) {
			System.out.printf(":)\nNome: %s\nCPF: %s\nMatrícula: %s\nSalario: %s\n\n",nome,cpf,matricula,salario);
		} else {
			System.out.printf("T-T\nNome: %s\nCPF: %s\nMatrícula: %s\nSalario: %s\n\n",nome,cpf,matricula,salario);
		}
	}
}
