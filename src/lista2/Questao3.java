package lista2;
import java.util.Scanner;

public class Questao3 {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		String[] nomes = new String[3];
		for(int i = 0; i<3; i++) {
			System.out.printf("Informe o %dº nome: ",i+1);
			nomes[i] = scanner.nextLine();
		}
		
		int quantA=0;
		int quantE=0;
		for(String nome: nomes) {
			for(int i = 0; i<nome.length(); i++) {
				if(nome.charAt(i) == 'A') {
					quantA++;
				} else if(nome.charAt(i) == 'E') {
					quantE++;
				}
			}
		}
		
		System.out.println("\nQuantidade de 'A' nos 3 nomes: " + quantA);
		System.out.println("\nQuantidade de 'E' nos 3 nomes: " + quantE);
		
	}

}
