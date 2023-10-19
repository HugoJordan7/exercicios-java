package lista7Questao7;

public class Boca {
	private String corDosLabios;
	private String tamanhoDosLabios;
	public Boca(String corDosLabios, String tamanhoDosLabios) {
		this.corDosLabios = corDosLabios;
		this.tamanhoDosLabios = tamanhoDosLabios;
	}
	@Override
	public String toString() {
		return "Boca [corDosLabios=" + corDosLabios + ", tamanhoDosLabios=" + tamanhoDosLabios + "]";
	}
	
}
