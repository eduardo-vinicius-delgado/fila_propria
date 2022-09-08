package entities;

public class Fila {
	
	private No primeiroNo = null;
	private int tamanho = 0;
	
	public int getTamanho() {
		return tamanho;
	}
	
	public int enfileirar(String valor) {
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
	
	public String toString() {
		No auxiliar = primeiroNo;
		String retorno = "";
		for(int i = tamanho; i > 0; i--) {
			retorno += String.format("%d", i)
					+ " - "
					+ auxiliar.getDado()
					+ "\n";
			auxiliar = auxiliar.getProximoNo();
		}
		return retorno;
	}
	
	public String desenfileirar() {
		String dado = "";
		if(tamanho == 1) {
			dado = primeiroNo.getDado();
			primeiroNo = null;
			tamanho--;
		}else{
			return "Daqui a pouco pronto";
		}
		return dado;
	}
	
	public static void main(String[] args) {
		Fila fila = new Fila();
		fila.enfileirar("A");
		System.out.println(fila);
		System.out.println();
		System.out.println(fila.desenfileirar());
		System.out.println();
		fila.enfileirar("A");
		fila.enfileirar("B");
		System.out.println(fila);
		System.out.println(fila.desenfileirar());
	}
	
}
