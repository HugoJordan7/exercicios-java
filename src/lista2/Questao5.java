package lista2;
import java.util.Scanner;

public class Questao5 {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		double[][] notas = new double[5][2];
		double[] medias = new double[5];
		for(int i =0; i<5; i++) {
			for(int j = 0; j<2; j++) {
				System.out.printf("Informe a %d nota do %d aluno: ",j+1,i+1);
				notas[i][j] = scanner.nextDouble();
			}
			System.out.println();
		}
		
		for(int i =0; i<5; i++) {
			medias[i] = (notas[i][0] + notas[i][1])/2;
			if(medias[i] >= 7) {
				System.out.printf("\nO aluno %d ficou com média %.2f e foi aprovado!\n",i+1,medias[i]);
			} else {
				System.out.printf("\nO aluno %d ficou com média %.2f e foi reprovado!\n",i+1,medias[i]);
			}
		}
		
	}

}
