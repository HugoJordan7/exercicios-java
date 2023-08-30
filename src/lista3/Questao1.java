package lista3;
import java.util.Scanner;

public class Questao1 {

	static Scanner scanner = new Scanner(System.in);
	static Scanner scannerNumbers = new Scanner(System.in);
	static String S1 = "";
	
	public static void main(String[] args) {
		int comando;
		do {
			System.out.println("- Menu de manipulação de strings -\n0 - Parar o programa\n1 - Ler uma string S1\n2 - Imprimir tamanho da string S1\n3 - Comparar a string S1 com uma nova string S2\n4 - Concatenar a string S1 com uma nova string S2 e conferir o resultado\n5 - Imprimir a string S1 ao inverso\nInforme o comando: ");
			comando = scannerNumbers.nextInt();
			switch(comando) {
				case 0:
					break;
				case 1:
					lerS1();
					break;
				case 2:
					imprimirTamanhoS1();
					break;
				case 3:
					compararS1S2();
					break;
				case 4:
					concatenarS2EmS1();
					break;
				case 5:
					imprimirS1Inverso();
					break;
				default:
					System.out.println("\nComando inválido!\n\n\n");
			}
		} while(comando != 0);
	}
	
	public static void lerS1() {
		System.out.print("\nInforme um nome para a string S1: ");
		S1 = scanner.nextLine();
		System.out.print("\n\n\n");
	}
	
	public static void imprimirTamanhoS1() {
		System.out.print("\nO tamanho da string S1 é: " + S1.length());
		System.out.print("\n\n\n");
	}
	
	public static void compararS1S2() {
		System.out.print("\nInforme um nome para uma nova string S2: ");
		String S2 = scanner.nextLine();
		
		System.out.print("\nComparando S1 e S2 de acordo com a posição da memória (==): ");
		if(S1 == S2) {
			System.out.println("São iguais!");
		} else {
			System.out.println("São diferentes!");
		}
		System.out.print("\nComparando S1 e S2 de acordo com os caracteres de sua composição (equals): ");
		if(S1.equals(S2)) {
			System.out.println("São iguais!");
		} else {
			System.out.println("São diferentes!");
		}
		
		System.out.print("\nComparando S1 e S2 de acordo com os caracteres de sua composição ignorando a diferença entre letras minúsculas e maiúsculas (equalsIgnoreCase): ");
		if(S1.equalsIgnoreCase(S2)) {
			System.out.println("São iguais!");
		} else {
			System.out.println("São diferentes!");
		}
		
		System.out.print("\nComparando S1 e S2 de acordo com a ordem alfabética (compareTo): ");
		if(S1.compareTo(S2) == 0) {
			System.out.println("São iguais!");
		} else {
			System.out.println("São diferentes!");
		}
		
		System.out.print("\n\n\n");
	}
	
	public static void concatenarS2EmS1() {
		System.out.print("\nInforme um nome para uma nova string S2: ");
		String S2 = scanner.nextLine();
		System.out.print("\nConcatenando S2 em S1: " + S1 + S2);
		System.out.print("\n\n\n");
	}
	
	public static void imprimirS1Inverso() {
		System.out.print("\nString S1 ao inverso: ");
		char[] vetor = new char[S1.length()];
		vetor = S1.toCharArray();
		for(int i = S1.length()-1; i >= 0; i--) {
			System.out.printf("%c",vetor[i]);
		}
		System.out.print("\n\n\n");
	}

}
