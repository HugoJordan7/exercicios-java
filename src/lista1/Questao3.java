package lista1;
import java.util.Scanner;
public class Questao3 {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		double[] notas = new double[4];
		System.out.print("Informe o nome do aluno: ");
		String aluno = scanner.nextLine();
		System.out.print("Informe o nome da disciplina: ");
		String disciplina = scanner.nextLine();
		for(int i = 0; i<4; i++) {
			System.out.printf("Informe a %dª nota: ",i+1);
			notas[i] = scanner.nextDouble();
		}
		double media = (notas[0] + notas[1] + notas[2] + notas[3])/4;
		System.out.printf("\nO aluno %s ficou com média %.2f na disciplina de %s",aluno,media,disciplina);
	}

}
