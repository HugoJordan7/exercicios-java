package lista2;
import java.util.Scanner;

public class Questao7 {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int tam = 5;
		int[][] matriz1 = new int[tam][tam];
		int[][] matriz2 = new int[tam][tam];
		
		int[][] matrizDaSoma = new int[tam][tam];
		int[][] matrizDaDiferenca = new int[tam][tam];
		
		System.out.println("\n- Informe os valores da primeira matriz -\n");
		for(int i = 0; i<tam; i++) {
			for(int j = 0; j<tam; j++) {
				System.out.printf("matriz[%d][%d]: ",i+1,j+1);
				matriz1[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("\n- Informe os valores da segunda matriz -\n");
		for(int i = 0; i<tam; i++) {
			for(int j = 0; j<tam; j++) {
				System.out.printf("matriz[%d][%d]: ",i+1,j+1);
				matriz2[i][j] = scanner.nextInt();
			}
		}
		
		for(int i = 0; i<tam; i++) {
			for(int j = 0; j<tam; j++) {
				matrizDaSoma[i][j] = matriz1[i][j] + matriz2[i][j];
				matrizDaDiferenca[i][j] = matriz1[i][j] - matriz2[i][j];
			}
		}
		
		System.out.println("\n- Valores da primeira matriz -\n");
		for(int[] i: matriz1) {
			for(int j: i) {
				System.out.printf("%d ",j);
			}
			System.out.println();
		}
		
		System.out.println("\n- Valores da segunda matriz -\n");
		for(int[] i: matriz2) {
			for(int j: i) {
				System.out.printf("%d ",j);
			}
			System.out.println();
		}
		
		System.out.println("\n- Matriz da soma -\n");
		for(int[] i: matrizDaSoma) {
			for(int j: i) {
				System.out.printf("%d ",j);
			}
			System.out.println();
		}
		
		System.out.println("\n- Matriz da diferença -\n");
		for(int[] i: matrizDaDiferenca) {
			for(int j: i) {
				System.out.printf("%d ",j);
			}
			System.out.println();
		}
		
	}

}
