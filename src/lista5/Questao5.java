package lista5;

import java.util.Scanner;

public class Questao5 {
	public static Scanner scanner = new Scanner(System.in);
	public static Scanner scannerText = new Scanner(System.in);
	public static void main(String[] args) {
		Pessoa[] listaDePessoas = new Pessoa[3];
		for(int i = 0; i<3; i++) {
			listaDePessoas[i] = new Pessoa();
			System.out.println("\n- Informe os dados da " + (i+1) + "ª pessoa -");
			System.out.print("Nome: ");
			listaDePessoas[i].nome = scannerText.nextLine();
			System.out.print("Idade: ");
			listaDePessoas[i].idade = scanner.nextInt();
			System.out.print("Profissão: ");
			listaDePessoas[i].profissao = scannerText.nextLine();
			System.out.print("CPF: ");
			listaDePessoas[i].CPF = scannerText.nextLine();
		}

	}

}
