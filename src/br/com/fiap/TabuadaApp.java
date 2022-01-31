package br.com.fiap;

import java.util.Scanner;

import br.com.fiap.tabuada.Tabuada;

public class TabuadaApp {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);

		// Declarando Variáveis
		int multiplicando, multiplicador;

		System.out.println("Digite um multiplicando: ");
		multiplicando=leitor.nextInt();

		System.out.println("Digite a quantidade que vai multiplicar: ");
		multiplicador=leitor.nextInt();
		
	Tabuada tabuada = new Tabuada();	
	tabuada.executarTabuada(multiplicando, multiplicador);

	}

}
