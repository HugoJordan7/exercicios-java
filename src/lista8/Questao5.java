package lista8;

public class Questao5 {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("João","000.000.000-00");
		Funcionario funcionario = new Funcionario("Lucas","000.000.000-00","555555",3000.00);
		Cliente cliente = new Cliente("Mateus","000.000.000-00",7);
		Gerente gerente = new Gerente("Marcos","000.000.000-00","555555",7000.00,2);
		
		pessoa.mostrarDados();
		funcionario.mostrarDados();
		cliente.mostrarDados();
		gerente.mostrarDados();
		
		pessoa.mostrarDados("Feliz");
		funcionario.mostrarDados("Triste");
		cliente.mostrarDados("Feliz");
		gerente.mostrarDados("Triste");
	}

}
