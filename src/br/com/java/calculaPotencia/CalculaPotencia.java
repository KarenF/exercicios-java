package br.com.java.calculaPotencia;

import java.util.Scanner;

/*
Faça um programa que peça dois números, base e expoente, calcule e
mostre o primeiro número elevado ao segundo número. Não utilize a
função de potência da linguagem.
 */
public class CalculaPotencia {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe a base: ");
		int base = scanner.nextInt();
		System.out.println("Informe a potência: ");
		int potencia = scanner.nextInt();
		int resultado = 1;

		if (base == 0) {

			resultado = 0;

		} else if (potencia == 0) {

			resultado = 1;

		} else {
			
			for (int i = 1; i <= potencia; i++) {
				resultado *= base;
			}
		}

		System.out.println("Resultado: " + resultado);
	}
}
