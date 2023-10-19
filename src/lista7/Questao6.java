package lista7;
import java.util.Scanner;

public class Questao6 {

	public static Scanner scanner = new Scanner(System.in);
	public static Scanner scannerText = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("** Informe os dados do livro **");
		System.out.println("\n- Título -");
		System.out.print("Nome do título: ");
		String nomeDoTitulo = scannerText.nextLine();
		System.out.print("Subtítulo: ");
		String subTitulo = scannerText.nextLine();
		Titulo titulo = new Titulo(nomeDoTitulo,subTitulo);
		
		System.out.println("\n- Editora -");
		System.out.print("Nome da editora: ");
		String nomeDaEditora = scannerText.nextLine();
		System.out.print("Endereco: ");
		String endereco = scannerText.nextLine();
		System.out.print("CNPJ: ");
		String CNPJ = scannerText.nextLine();
		Editora editora = new Editora(nomeDaEditora,endereco,CNPJ);
		
		System.out.println("\n- Autor -");
		System.out.print("Nome: ");
		String nome = scannerText.nextLine();
		System.out.print("Formação: ");
		String areaDeFormacao = scannerText.nextLine();
		System.out.print("Idade: ");
		int idade = scanner.nextInt();
		Autor autor = new Autor(nome,idade,areaDeFormacao);
		
		System.out.println("\n- Capítulos -");
		System.out.print("Informe a quantidade de capítulos do livro: ");
		int quant = scanner.nextInt();
		Capitulo[] capitulos = new Capitulo[quant];
		for(int i = 0; i<quant;i++) {
			System.out.printf("Número da primeira página do %dº capítulo: ",i+1);
			int paginaInicial = scanner.nextInt();
			System.out.printf("Nome do %dº capítulo: ",i+1);
			String nomeDoCapitulo = scannerText.nextLine();
			capitulos[i] = new Capitulo(paginaInicial,nomeDoCapitulo);
		}
		
		Livro livro = new Livro(titulo,editora,capitulos,autor);
		System.out.print("\n\n"+livro.toString());
	}

}
