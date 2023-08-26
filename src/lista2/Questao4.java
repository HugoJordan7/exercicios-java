package lista2;
import java.util.Scanner;

public class Questao4 {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int[] vetor = new int[10];
		for(int i = 0; i<10; i++) {
			System.out.printf("Informe o %dº número: ",i+1);
			vetor[i] = scanner.nextInt();
		}
		

		for(int i = 0; i<9; i++) {
			for(int j = i+1; j<10; j++) {
				if(vetor[i] > vetor[j]) {
					int aux = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = aux;
				}
			}
		}
		System.out.printf("\nVetor em ordem crescente: \n");
		for(int numero: vetor) {
			System.out.printf("%d ",numero);
		}
		
		System.out.printf("\nVetor em ordem decrescente: \n");
		for(int i = 9; i>=0; i--) {
			System.out.printf("%d ",vetor[i]);
		}
		
	}

}
