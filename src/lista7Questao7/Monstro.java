package lista7Questao7;

public class Monstro {
	private Perna perna;
	private Braco braco;
	private Cabeca cabeca;
	private Olho olho;
	private Boca boca;
	public Monstro(Perna perna, Braco braco, Cabeca cabeca, Olho olho, Boca boca) {
		this.perna = perna;
		this.braco = braco;
		this.cabeca = cabeca;
		this.olho = olho;
		this.boca = boca;
	}
	@Override
	public String toString() {
		return "Monstro [perna=" + perna + ", braco=" + braco + ", cabeca=" + cabeca + ", olho=" + olho + ", boca="
				+ boca + "]";
	}
	
}
