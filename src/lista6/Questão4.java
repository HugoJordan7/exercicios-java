package lista6;
import java.util.Scanner;

public class Questão4 {
	public static Scanner scanner = new Scanner(System.in);
	public static Scanner scannerText = new Scanner(System.in);

	public static void main(String[] args) {
		Carro carro1 = new Carro();
		System.out.println("- Informe os dados do primeiro carro -");
		System.out.print("Marca: ");
		carro1.setMarca(scannerText.nextLine());
		System.out.print("Modelo: ");
		carro1.setModelo(scannerText.nextLine());
		System.out.print("Ano de fabricação: ");
		carro1.setAnoDeFabricacao(scanner.nextInt());
		System.out.print("Tipo de combustível: ");
		carro1.setTipoDeCombustivel(scannerText.nextLine());
		
		System.out.println("- Informe os dados do segundo carro -");
		System.out.print("Marca: ");
		String marca = scannerText.nextLine();
		System.out.print("Modelo: ");
		String modelo = scannerText.nextLine();
		System.out.print("Ano de fabricação: ");
		int anoDeFabricacao = scanner.nextInt();
		System.out.print("Tipo de combustível: ");
		String tipoDeCombustivel = scannerText.nextLine();
		Carro carro2 = new Carro(marca,modelo,anoDeFabricacao,tipoDeCombustivel);
		
		Pessoa pessoa1 = new Pessoa();
		System.out.println("- Informe os dados da primeira pessoa -");
		System.out.print("Nome: ");
		pessoa1.setNome(scannerText.nextLine());
		System.out.print("Sobrenome: ");
		pessoa1.setSobreNome(scannerText.nextLine());
		System.out.print("Idade: ");
		pessoa1.setIdade(scanner.nextInt());
		
		System.out.println("- Informe os dados da segunda pessoa -");
		System.out.print("Marca: ");
		String nome = scannerText.nextLine();
		System.out.print("Modelo: ");
		String sobreNome = scannerText.nextLine();
		System.out.print("Ano de fabricação: ");
		int idade = scanner.nextInt();
		Pessoa pessoa2 = new Pessoa(nome,sobreNome,idade);
		
		//Relacionando os objetos
		pessoa1.setCarro(carro1);
		pessoa2.setCarro(carro2);
		carro1.setDono(pessoa1);
		carro2.setDono(pessoa2);
		
		System.out.println("Pessoa 1 acelerando o carro: ");
		pessoa1.acelerarCarro();
		System.out.println("Pessoa 2 desligando o carro: ");
		pessoa2.desligarCarro();
	}

}
