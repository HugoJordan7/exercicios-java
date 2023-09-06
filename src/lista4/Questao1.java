package lista4;
import java.util.Scanner;

public class Questao1 {
	public static Scanner scanner = new Scanner(System.in);
	
	public static int parOuImpar(int num){
		if(num % 2 == 0) {
			return 1;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		System.out.print("Informe um número para saber se ele é par ou ímpar: ");
		int numero = scanner.nextInt();
		int resultado = parOuImpar(numero);
		if(resultado == 1) {
			System.out.print("O número " + numero + " é par!");
		} else {
			System.out.print("O número " + numero + " é ímpar!");
		}
	}
}
