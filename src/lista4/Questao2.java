package lista4;
import java.util.Scanner;

public class Questao2 {
	public static Scanner scanner = new Scanner(System.in);
	public static Scanner scannerText = new Scanner(System.in);
	public static float calcularMedia(float n1, float n2, float n3, char tipoDeMedia) {
		if(tipoDeMedia == 'A') {
			return ((n1+n2+n3)/3);
		} else if(tipoDeMedia == 'P') {
			return (((n1*5)+(n2*3)+(n3*2))/10);
		}
		return -1;
	}
	
	public static void main(String[] args) {
		System.out.print("- Informe as 3 notas de um aluno -\n");
		float[] notas = new float[3];
		for(int i = 0; i<3; i++) {
			System.out.print((i+1) + "ª nota: ");
			notas[i] = scanner.nextFloat();
		}
		System.out.print("Informe 'A' para média aritmetica ou 'P' para ponderada: ");
		String tipoMedia = scannerText.nextLine();
		
		float resultado = calcularMedia(notas[0],notas[1],notas[2],tipoMedia.charAt(0));
		if (resultado == -1) {
			System.out.println("O tipo de média informado é inválido!");
		} else {
			System.out.printf("A média do aluno foi: %.2f",resultado);
		}
		

	}

}
