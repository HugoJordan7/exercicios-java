package lista5;
import java.util.Scanner;

public class Questao4 {
	public static Scanner scanner = new Scanner(System.in);
	public static Scanner scannerText = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Animal[] listaDeAnimais = new Animal[3];
		for(int i = 0; i<3; i++) {
			listaDeAnimais[i] = new Animal();
			System.out.println("\n- Informe os dados do " + (i+1) + "º animal -");
			System.out.print("Nome: ");
			listaDeAnimais[i].nome = scannerText.nextLine();
			System.out.print("Idade: ");
			listaDeAnimais[i].idade = scanner.nextInt();
			System.out.print("Espécie: ");
			listaDeAnimais[i].especie = scannerText.nextLine();
			System.out.print("Raça: ");
			listaDeAnimais[i].raca = scannerText.nextLine();
		}	
	}
}
