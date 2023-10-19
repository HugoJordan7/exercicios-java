package lista7Questao6;

public class Autor {
	private String nome;
	private int idade;
	private String areaDeFormacao;
	public Autor(String nome, int idade, String areaDeFormacao) {
		this.nome = nome;
		this.idade = idade;
		this.areaDeFormacao = areaDeFormacao;
	}
	@Override
	public String toString() {
		return "Autor [nome=" + nome + ", idade=" + idade + ", areaDeFormacao=" + areaDeFormacao + "]";
	}
}
