package lista2;
import java.util.Scanner;

public class Questao2 {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		double salario = 0;
		int filhos;
		double somaSalarios = 0;
		int somaFilhos = 0;
		int quantHabitantes = 0;
		double maiorSalario = 0;
		do {
			System.out.print("Informe o salário do habitante ou -1 para parar: ");
			salario = scanner.nextDouble();
			if(salario != -1) {
				if(salario > maiorSalario) {
					maiorSalario = salario;
				}
				somaSalarios = somaSalarios + salario;
				System.out.print("Informe o número de filhos do habitante: ");
				filhos = scanner.nextInt();
				somaFilhos = somaFilhos + filhos;
				quantHabitantes++;
			}
		} while(salario != -1);
		
		System.out.println("\nMédia de salário da população: " + somaSalarios/quantHabitantes);
		System.out.println("\nMédia de filhos da população: " + somaFilhos/quantHabitantes);
		System.out.println("\nMaior salário: " + maiorSalario);
		
	}
}
