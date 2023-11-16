package projeto;

public class Contato {
	protected String nome;
	protected String numero;
	protected String email;
	
	Contato(String nome, String numero, String email){
		this.nome = nome;
		this.numero = numero;
		this.email = email;
	}
	
	public String getNomeDaClasse() {
		return "Contato";
	}
	
	public void imprimirContato() {
		System.out.println(nome + "(" + getNomeDaClasse() + ")");
	}
}