package projeto;

public class ContatoEmpresarial extends Contato {
	private String cnpj;
	private String endereco;
	
	ContatoEmpresarial(String nome, String numero, String email, String cnpj, String endereco){
		super(nome, numero, email);
		this.cnpj = cnpj;
		this.endereco = endereco;
	}
	
	public String getNomeDaClasse() {
		return "Empresarial";
	}
	
	public void imprimirContato(boolean maisInfo) {
		if(maisInfo) {
			System.out.println("\n	Contato " + getNomeDaClasse());
			System.out.println("Nome: " + nome);
			System.out.println("Numero: " + numero);
			System.out.println("Email: " + email);
			System.out.println("CNPJ: "+cnpj);
			System.out.println("Endereco: "+endereco);
		} else {
			imprimirContato();
		}
	}
}