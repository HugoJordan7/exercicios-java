package lista7;
import java.util.Scanner;

public class Questao7 {

	public static Scanner scanner = new Scanner(System.in);
	public static Scanner scannerText = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("** Informe os dados do monstro **");
		System.out.println("\n- Cabeça -");
		System.out.print("Cor do cabelo: ");
		String corDoCabelo = scannerText.nextLine();
		System.out.print("Tamanho da cabeça: ");
		String tamanhoDaCabeca = scannerText.nextLine();
		Cabeca cabeca = new Cabeca(corDoCabelo,tamanhoDaCabeca);
		
		System.out.println("\n- Olhos -");
		System.out.print("Cor dos olhos: ");
		String cor = scannerText.nextLine();
		System.out.print("Quantidade de olhos: ");
		int quantidade = scanner.nextInt();
		Olho olho = new Olho(cor,quantidade);
		
		System.out.println("\n- Boca -");
		System.out.print("Cor dos lábios: ");
		String corDosLabios = scannerText.nextLine();
		System.out.print("Tamanho dos lábios: ");
		String tamanhoDosLabios = scannerText.nextLine();
		Boca boca = new Boca(corDosLabios,tamanhoDosLabios);
		
		System.out.println("\n- Pernas -");
		System.out.print("Comprimento das pernas: ");
		String comprimento = scannerText.nextLine();
		System.out.print("Tamanho dos pés: ");
		String tamanhoDosPes = scannerText.nextLine();
		Perna perna = new Perna(comprimento,tamanhoDosPes);
		
		System.out.println("\n- Braços -");
		System.out.print("Tamanho dos braços: ");
		String tamanho = scannerText.nextLine();
		System.out.print("Quantidade de braços: ");
		int quantidadeDeBracos = scanner.nextInt();
		Braco braco = new Braco(tamanho,quantidadeDeBracos);
		
		Monstro monstro = new Monstro(perna,braco,cabeca,olho,boca);
		System.out.print("\n\n"+monstro.toString());
	}

}
