package lista2;
import java.util.Scanner;

public class Questao6 {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Informe a quantidade de linhas da matriz: ");
		int linhas = scanner.nextInt();
		System.out.println("Informe a quantidade de colunas da matriz: ");
		int colunas = scanner.nextInt();
		int[][] matriz = new int[linhas][colunas];
		int[][] matrizTransposta = new int[colunas][linhas];
		
		System.out.println("\n- Informe os valores da matriz -\n");
		for(int i = 0; i<linhas; i++) {
			for(int j = 0; j<colunas; j++) {
				System.out.printf("matriz[%d][%d]: ",i+1,j+1);
				matriz[i][j] = scanner.nextInt();
				matrizTransposta[j][i] = matriz[i][j];
			}
		}
		
		System.out.println("\n- Valores da matriz -\n");
		for(int[] i: matriz) {
			for(int j: i) {
				System.out.printf("%d ",j);
			}
			System.out.println();
		}
		
		System.out.println("\n- Valores da matriz transposta -\n");
		for(int[] i: matrizTransposta) {
			for(int j: i) {
				System.out.printf("%d ",j);
			}
			System.out.println();
		}
		
		
		
	}

}
