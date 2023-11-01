package lista8;

public class Gerente extends Funcionario{
	protected int area;
	
	public Gerente(String nome,String cpf,String matricula,double salario,int area) {
		super(nome,cpf,matricula,salario);
		this.area = area;
	}
	
	public void mostrarDados() {
		System.out.printf("Nome: %s\nCPF: %s\nMatrícula: %s\nSalario: %s\nÁrea: %s\n\n",nome,cpf,matricula,salario,area);
	}
	
	public void mostrarDados(String palavra) {
		if(palavra.equalsIgnoreCase("Feliz")) {
			System.out.printf(":)\nNome: %s\nCPF: %s\nMatrícula: %s\nSalario: %s\nÁrea: %s\n\n",nome,cpf,matricula,salario,area);
		} else {
			System.out.printf("T-T\nNome: %s\nCPF: %s\nMatrícula: %s\nSalario: %s\nÁrea: %s\n\n",nome,cpf,matricula,salario,area);
		}
	}
}
