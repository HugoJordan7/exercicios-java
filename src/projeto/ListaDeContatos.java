package projeto;

public class ListaDeContatos {
	
	public Contato[] contatos;
	public int tam;
	public int indexAtual = 0;
	
	public ListaDeContatos(int tam){
		this.tam = tam;
		contatos = new Contato[tam];
	}

	public int getTam() {
		return tam;
	}

	public int getIndexAtual() {
		return indexAtual;
	}

	public void addContato(Contato contato) {
		contatos[indexAtual] = contato;
		indexAtual++;
	}
	
	public Contato getContato(int index){
		return contatos[index];
	}
	
	public void removerContato(int index) {
		index--;
		if(index < 0 || index >= indexAtual) {
			System.out.println("Index invalido!");
		} else {
			for(int i = index; i<indexAtual-1; i++) {
				contatos[i] = contatos[i+1];
			}
			indexAtual--;
		}
	}
	
	public void imprimirAgenda() {
		if(indexAtual == 0) {
			System.out.println("A agenda esta vazia!");
		} else{
			System.out.println("\n- Imprimindo contatos -");
			for(int i = 0; i < indexAtual; i++) {
				System.out.println("\n" + (i+1) + "° Contato:");
				contatos[i].imprimirContato();
			}
		}
	}
}
