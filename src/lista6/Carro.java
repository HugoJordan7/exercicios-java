package lista6;

public class Carro {
	private String marca;
	private String modelo;
	private int anoDeFabricacao;
	private String tipoDeCombustivel;
	private Pessoa dono;
	
	public Carro() {
		
	}
	
	public Carro(String marca,String modelo,int anoDeFabricacao,String tipoDeCombustivel) {
		this.marca = marca;
		this.modelo = modelo;
		this.anoDeFabricacao = anoDeFabricacao;
		this.tipoDeCombustivel = tipoDeCombustivel;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setDono(Pessoa dono) {
		this.dono = dono;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setAnoDeFabricacao(int anoDeFabricacao) {
		this.anoDeFabricacao = anoDeFabricacao;
	}
	public void setTipoDeCombustivel(String tipoDeCombustivel) {
		this.tipoDeCombustivel = tipoDeCombustivel;
	}
	
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public int getAnoDeFabricacao() {
		return anoDeFabricacao;
	}
	public String getTipoDeCombustivel() {
		return tipoDeCombustivel;
	}
	public Pessoa getDono() {
		return dono;
	}
	
	public void ligar() {
		System.out.println("Ligando o carro...");
	}
	public void desligar() {
		System.out.println("Desligando o carro...");
	}
	public void frear() {
		System.out.println("Freiando o carro...");
	}
	public void acelerar() {
		System.out.println("Acelerando o carro...");
	}

}
