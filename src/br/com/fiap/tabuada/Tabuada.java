package br.com.fiap.tabuada;

public class Tabuada {

	 public void executarTabuada(int multiplicando, int multiplicador) {
		int contador = 0;
		while (contador <= multiplicador) {
			System.out.println(multiplicando + " x " + contador + " = " + multiplicando * contador);
			contador++;
		}

	}

}
