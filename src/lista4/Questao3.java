package lista4;
import java.util.Scanner;

public class Questao3 {
	public static Scanner scanner = new Scanner(System.in);
	
	public static int calcularSomatorio(int N) {
		if(N < 1) {
			return -1;
		} else if (N == 1) {
			return 1;
		}
		return N + calcularSomatorio(N-1);
	}
	
	public static void main(String[] args) {
		System.out.print("Informe um número N para calcular o somatório de 1 até o inteiro N: ");
		int N = scanner.nextInt();
		int resultado = calcularSomatorio(N);
		if(resultado == -1) {
			System.out.println("Número inválido!");
		} else {
			System.out.println("O somatório de 1 a " + N + " é: " + resultado);
		}
	}

}
