package lista7;
import java.util.Scanner;

public class Questao4 {

	public static Scanner scanner = new Scanner(System.in);
	public static Scanner scannerText = new Scanner(System.in);
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		System.out.println("- Informe os dados de uma pessoa -");
		System.out.print("Nome: ");
		pessoa.setNome(scannerText.nextLine());
		
		System.out.println("\n- Data de nascimento -");
		System.out.print("Dia: ");
		int dia = scanner.nextInt();
		System.out.print("Mês: ");
		int mes = scanner.nextInt();
		System.out.print("Ano: ");
		int ano = scanner.nextInt();
		Data data = new Data(dia,mes,ano);
		pessoa.setDataNasc(data);
		
		System.out.println("\n- Contato -");
		System.out.print("Telefone residencial: ");
		String telefoneResi = scannerText.nextLine();
		System.out.print("Celular: ");
		String celular = scannerText.nextLine();
		System.out.print("Email: ");
		String email = scannerText.nextLine();
		Contato contato = new Contato(telefoneResi,celular,email);
		pessoa.setContato(contato);
		
		System.out.println("\n- Endereço -");
		System.out.print("Logradouro: ");
		String logradouro = scannerText.nextLine();
		System.out.print("Numero: ");
		int numero = scanner.nextInt();
		System.out.print("Bairro: ");
		String bairro = scannerText.nextLine();
		System.out.print("Cidade: ");
		String cidade = scannerText.nextLine();
		System.out.print("Estado: ");
		String estado = scannerText.nextLine();
		System.out.print("Cep: ");
		String cep = scannerText.nextLine();
		Endereco endereco = new Endereco(logradouro,numero,bairro,cidade,estado,cep);
		pessoa.setEndereco(endereco);
		
		pessoa.exibirDadosPessoais();
	}

}
