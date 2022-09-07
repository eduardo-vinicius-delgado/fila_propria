package entities;

public class Fila {
	
	private No primeiroNo = null;
	private int tamanho = 0;
	
	public int getTamanho() {
		return tamanho;
	}
	
	public int acrescentarFila(String valor) {
		No novoNo = new No();
		novoNo.setDado(valor);
		if(primeiroNo == null) {
			novoNo.setProximoNo(null);
			primeiroNo = novoNo;
		}else{
			novoNo.setProximoNo(primeiroNo);
			primeiroNo = novoNo;
		}
		tamanho++;
		return 1;
	}
	
	public static void main(String[] args) {
		Fila fila = new Fila();
		fila.acrescentarFila("A");
		fila.acrescentarFila("B");
		fila.acrescentarFila("C");
		No auxiliar = fila.primeiroNo;
		
		while(auxiliar != null) {
			System.out.println(auxiliar.getDado());
			auxiliar = auxiliar.getProximoNo();
		}
	}
	
}
