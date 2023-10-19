package lista7;
import java.util.Scanner;

public class Questao5 {

	public static Scanner scanner = new Scanner(System.in);
	public static Scanner scannerText = new Scanner(System.in);
	public static void main(String[] args) {
		Computador computador = new Computador();
		System.out.println("** Informe os dados do computador **");
		
		System.out.println("\n- Placa Mãe -");
		System.out.print("Processador: ");
		String processador = scannerText.nextLine();
		System.out.print("Número de portas de conexão: ");
		String numeroDePortasDeConexao = scannerText.nextLine();
		System.out.print("Dimensões: ");
		String dimensoes = scannerText.nextLine();
		System.out.print("Quantidade de slots de memoria: ");
		int quantDeSlotsDeMemoriaRAM = scanner.nextInt();
		PlacaMae placa = new PlacaMae(processador,numeroDePortasDeConexao,dimensoes,quantDeSlotsDeMemoriaRAM);
		computador.setPlacaMae(placa);
		
		System.out.println("\n- Memória -");
		System.out.print("Capacidade de armazenamento: ");
		String tamanho = scannerText.nextLine();
		System.out.print("Tipo de tecnologia: ");
		String tipoDeTecnologia = scannerText.nextLine();
		System.out.print("Velocidade de leitura: ");
		String leitura = scannerText.nextLine();
		System.out.print("Velocidade de gravação: ");
		String gravacao = scannerText.nextLine();
		Memoria memoria = new Memoria(tamanho,tipoDeTecnologia,leitura,gravacao);
		computador.setMemoria(memoria);
		
		System.out.println("\n- Monitor -");
		System.out.print("Tipo de tela: ");
		String tipoDeTela = scannerText.nextLine();
		System.out.print("Resolucao: ");
		String resolucao = scannerText.nextLine();
		System.out.print("Taxa de atualização de tela (hz): ");
		int taxaDeAtualizacaoDeTela = scanner.nextInt();
		Monitor monitor = new Monitor(tipoDeTela,resolucao,taxaDeAtualizacaoDeTela);
		computador.setMonitor(monitor);
		
		System.out.println("\n- Teclado -");
		System.out.print("Idioma: ");
		String idioma = scannerText.nextLine();
		System.out.print("Número de teclas: ");
		int numeroDeTeclas = scanner.nextInt();
		System.out.print("Tipo de conexão: ");
		String tipoDeConexao = scannerText.nextLine();
		Teclado teclado = new Teclado(idioma,numeroDeTeclas,tipoDeConexao);
		computador.setTeclado(teclado);
		
		computador.exibirDadosDoComputador();
	}

}
