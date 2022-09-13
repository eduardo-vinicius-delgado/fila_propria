package application;

import entities.Fila;

public class Main {

	public static void main(String[] args) {
		Fila fila = new Fila();
		fila.enfileirar("a");
		fila.enfileirar("b");
		fila.enfileirar("c");
		System.out.println(fila.getTamanho());
		System.out.println(fila);
		System.out.println(fila.desenfileirar());
		System.out.println(fila.getTamanho());
		System.out.println(fila);
	}

}
