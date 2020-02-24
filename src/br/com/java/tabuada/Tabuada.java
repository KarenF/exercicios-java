package br.com.java.tabuada;

import java.util.Scanner;

/*
Desenvolva um gerador de tabuada, capaz de gerar a tabuada de
qualquer número inteiro entre 1 a 10. O usuário deve informar de qual
numero ele deseja ver a tabuada. A saída deve ser conforme o
exemplo abaixo:
 */
public class Tabuada {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Tabuada do número: ");
		int numero = scanner.nextInt();

		System.out.println("Tabuada de " + numero);
		for (int i = 1; i <= 10; i++) {

			System.out.println(numero + " X " + i + " = " + numero*i);
		}
	}

}
