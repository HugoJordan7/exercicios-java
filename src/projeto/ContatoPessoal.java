package projeto;

public class ContatoPessoal extends Contato {
	private int idade;
	private String cpf;
	private String profissao;

	ContatoPessoal(String nome, String numero, String email, int idade, String cpf, String profissao){
		super(nome, numero, email);
		this.idade = idade;
		this.cpf = cpf;
		this.profissao = profissao;
	}
	
	public String getNomeDaClasse() {
		return "Pessoal";
	}
	
	public void imprimirContato(boolean maisInfo) {
		if(maisInfo) {
			System.out.println("\n	Contato " + getNomeDaClasse());
			System.out.println("Nome: " + nome);
			System.out.println("Numero: " + numero);
			System.out.println("Email: " + email);
			System.out.println("Idade: " + idade+" anos");
			System.out.println("CPF: "+cpf);
			System.out.println("Profissão: "+profissao);
		} else {
			imprimirContato();
		}
	}
}