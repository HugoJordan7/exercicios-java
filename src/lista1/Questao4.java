package lista1;
import java.util.Scanner;

public class Questao4 {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Informe o comprimento do primeiro pedaço de madeira: ");
		double comprimento1 = scanner.nextDouble();
		System.out.print("Informe o comprimento do segundo pedaço de madeira: ");
		double comprimento2 = scanner.nextDouble();
		System.out.print("Informe o comprimento do primeiro pedaço de madeira: ");
		double comprimento3 = scanner.nextDouble();
		
		if(comprimento1 < comprimento2 + comprimento3 && comprimento2 < comprimento1 + comprimento3 && comprimento3 < comprimento1 + comprimento2) {
			System.out.print("\nForma um triângulo!");
		} else {
			System.out.print("\nNão forma um triângulo!");
		}
		
	}

}
