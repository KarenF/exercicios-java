package br.com.java.validaNotas;

import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez. Mostre uma
mensagem caso o valor seja inválido e continue pedindo até que o
usuário informe um valor válido.
 */

public class ValidaNotas {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int nota;
		
		do {
			System.out.println("Digite uma nota entre 0 e 10: ");
			nota = scanner.nextInt();
		} while (nota < 0 || nota > 10);
		
		System.out.println("Nota final: " + nota);
	}

}
