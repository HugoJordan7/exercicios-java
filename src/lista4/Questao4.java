package lista4;
import java.util.Scanner;

public class Questao4 {
	public static Scanner scanner = new Scanner(System.in);
	public static Scanner scannerText = new Scanner(System.in);
	
	public static void main(String[] args) {
		Filme[] filmes = new Filme[3];
		System.out.println("- Informe os dados de 3 filmes diferentes -");
		for(int i = 0; i<3; i++) {
			filmes[i] = new Filme();
			System.out.println("\n	" + (i+1) + "º Filme: ");
			System.out.print("Nome: ");
			filmes[i].nome = scannerText.nextLine();
			System.out.print("Autor: ");
			filmes[i].autor = scannerText.nextLine();
			System.out.print("Ano: ");
			filmes[i].ano = scanner.nextInt();
			System.out.print("Preço: ");
			filmes[i].preco = scanner.nextDouble();
		}
		
		System.out.println("\n\n- Dados dos filmes registrados -");
		for(int i = 0; i<3; i++) {
			System.out.println("\n	" + (i+1) + "º Filme: ");
			System.out.println("Nome: " + filmes[i].nome);
			System.out.println("Autor: " + filmes[i].autor);
			System.out.println("Ano: " + filmes[i].ano);
			System.out.printf("Preço: %.2f",filmes[i].preco);
		}
	}

}
