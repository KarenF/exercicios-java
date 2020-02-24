package br.com.java.intervaloNumeros;

import java.util.Scanner;

/*
Faça um programa que receba dois números inteiros e gere os
números inteiros que estão no intervalo compreendido por eles.
 */
public class IntervaloNumeros {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro número:");
		int numero1 = scanner.nextInt();
		System.out.println("Digite o segundo número:");
		int numero2 = scanner.nextInt();

		if (numero1 < numero2) {

			for (int i = numero1 + 1; i < numero2; i++) {

				System.out.println("Números do intervalo: " + i);
			}

		} else if (numero2 < numero1) {

			for (int i = numero2 + 1; i < numero1; i++) {

				System.out.println("Números do intervalo: " + i);
			}
		
		} else {
			System.out.println("Não há intervalo de números");
		}
	}
}
