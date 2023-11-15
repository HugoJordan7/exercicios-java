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
			System.out.println("\n- Agenda de Contatos -");    
			System.out.println("0 - Parar o programa");
			System.out.println("1 - Adicionar um novo contato");
			System.out.println("2 - Remover contato");
			System.out.println("3 - Imprimir todos os contatos da agenda");
			System.out.println("Informe um comando: ");
			comando = scanner.nextInt();
			switch(comando) {
				case 0:
					System.out.print("oiiiiiiiiiiiiiiiiiiiiiii");
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
				default:
					System.out.println("Comando invalido!");
			}
			clearScreen();
		} while(comando != 0);
		System.out.println("- Programa encerrado -");
	}
	
	public static void adicionarContato() {
		if(agenda.getIndexAtual() == agenda.getTam()) {
			System.out.println("A agenda ja esta cheia!");
		} else {
			Contato contato = new Contato();
			System.out.println(" - Informe os dados do contato -");
			System.out.print("Nome: ");
			contato.setNome(scannerText.nextLine());
			System.out.print("Numero: ");
			contato.setNumero(scannerText.nextLine());
			System.out.print("Idade: ");
			contato.setIdade(scanner.nextInt());
			System.out.print("Email: ");
			contato.setEmail(scannerText.nextLine());
			agenda.addContato(contato);
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
	
	public static void clearScreen() {
		System.out.println("\nPressione enter para continuar...");
		scannerText.nextLine();
        System.out.println("\n".repeat(50)); //repete o conteúdo da string N vezes
    }

}