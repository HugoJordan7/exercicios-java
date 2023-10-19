package lista7;

public class Pessoa {
	private String nome;
	private Data dataNasc;
	private Endereco endereco;
	private Contato contato;

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setDataNasc(Data dataNasc) {
		this.dataNasc = dataNasc;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}
	
	public void exibirDadosPessoais() {
		System.out.println("\n\n- Exibindo dados da pessoa -");
		System.out.println("Nome: " + nome);
		System.out.println(dataNasc.getDataToString());
		System.out.println(contato.getContatoToString());
		System.out.println(endereco.getEnderecoToString());
	}
}
