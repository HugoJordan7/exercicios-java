package projeto;
import java.util.Scanner;

public class Main {
	public static Scanner scanner = new Scanner(System.in);
	public static Scanner scannerText = new Scanner(System.in);
	public static ListaDeContatos agenda;
	
	public static void main(String[] args) {
		System.out.print("Informe o tamanho da agenda: ");
		int tamanho = scanner.nextInt();
		clearScreen();
		agenda = new ListaDeContatos(tamanho);
		int comando;
		do {
			System.out.println("\n		- Agenda de Contatos -");
			System.out.println("******************************************************");       
			System.out.println("0 - Parar o programa");
			System.out.println("1 - Adicionar um novo contato");
			System.out.println("2 - Remover contato");
			System.out.println("3 - Imprimir todos os contatos da agenda");
			System.out.println("4 - Obter mais informações de um contato");
			System.out.println("******************************************************");   
			System.out.print("Informe um comando: ");
			comando = scanner.nextInt();
			switch(comando) {
				case 0:
					System.out.println("- Programa encerrado -");
					break;
				case 1:
					adicionarContato();
					break;
				case 2:
					removerContato();
					break;
				case 3:
					agenda.imprimirAgenda();
					break; 
				case 4:
					obterInfo();
					break; 
				default:
					System.out.println("Comando invalido!");
			}
			if(comando != 0) {
				clearScreen();
			}
		} while(comando != 0);
	}
	
	public static void adicionarContato() {
		if(agenda.getIndexAtual() == agenda.getTam()) {
			System.out.println("\nA agenda ja esta cheia!");
		} else {
			System.out.println("\n - Informe os dados do contato -");
			System.out.print("Digite 1 para contato pessoal ou 2 para contato empresarial: ");
			int tipo = scanner.nextInt();
			if(tipo != 1 && tipo != 2) {
				System.out.println("Tipo de contato inválido!\n\n");
				adicionarContato();
			} else {
				System.out.print("Nome: ");
				String nome = scannerText.nextLine();
				System.out.print("Numero: ");
				String numero = scannerText.nextLine();
				System.out.print("Email: ");
				String email = scannerText.nextLine();
				if(tipo == 1) {
					System.out.print("Idade: ");
					int idade = scanner.nextInt();
					System.out.print("Profissão: ");
					String profissao = scannerText.nextLine();
					System.out.print("CPF: ");
					String cpf = scannerText.nextLine();
					ContatoPessoal contato = new ContatoPessoal(nome,numero,email,idade,profissao,cpf);
					agenda.addContato(contato);
				} else{
					System.out.print("CNPJ: ");
					String cnpj = scannerText.nextLine();
					System.out.print("Endereço: ");
					String endereco = scannerText.nextLine();
					ContatoEmpresarial contato = new ContatoEmpresarial(nome,numero,email,cnpj,endereco);
					agenda.addContato(contato);
				}
			}
		}
	}
	
	public static void removerContato() {
		if(agenda.getIndexAtual() == 0) {
			System.out.println("A agenda esta vazia!");
		} else {
			System.out.println("Informe a posição do contato que deve ser removido: ");
			agenda.removerContato(scanner.nextInt());
		}
	}
	
	public static void obterInfo() {
		if(agenda.getIndexAtual() == 0) {
			System.out.println("A agenda esta vazia!");
		} else {
			System.out.print("Informe a posição do contato para obter mais informações: ");
			int pos = scanner.nextInt();
			if(pos < 1 || pos > agenda.getTam()) {
				System.out.println("Posição inválida!\n\n");
			} else {
				Contato contato = agenda.getContato(pos-1);
				if(contato instanceof ContatoPessoal) {
					((ContatoPessoal) contato).imprimirContato(true);
				} else {
					((ContatoEmpresarial) contato).imprimirContato(true);
				}
			}
		}
	}
	
	public static void clearScreen() {
		System.out.println("\nPressione enter para continuar...");
		scannerText.nextLine();
        System.out.println("\n".repeat(50)); //repete o conteúdo da string N vezes
    }

}