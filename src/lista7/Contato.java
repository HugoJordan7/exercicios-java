package lista7;

public class Contato {
	private String telefoneResid;
	private String celular;
	private String email;
	
	public Contato(String telefoneResid, String celular, String email) {
		this.telefoneResid = telefoneResid;
		this.celular = celular;
		this.email = email;
	}
	
	public String getContatoToString() {
		return "Telefone Residencial: "+telefoneResid+"\nCelular: "+celular+"\nEmail: "+email;
	}
}
