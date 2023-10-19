package lista7;

import lista6.Memoria;

public class Computador {
	private Monitor monitor;
	private Teclado teclado;
	private Memoria memoria;
	private PlacaMae placaMae;
		
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	public void setTeclado(Teclado teclado) {
		this.teclado = teclado;
	}
	public void setMemoria(Memoria memoria) {
		this.memoria = memoria;
	}
	public void setPlacaMae(PlacaMae placaMae) {
		this.placaMae = placaMae;
	}
	
	public void exibirDadosDoComputador() {
		System.out.println("\n\n- Exibindo dados do computador -");
		System.out.println(monitor.toString());
		System.out.println(teclado.toString());
		System.out.println(memoria.toString());
		System.out.println(placaMae.toString());
	}
}
