package br.com.java.quantidadeParesImpares;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Faça um programa que peça 10 números inteiros, calcule e mostre a
quantidade de números pares e a quantidade de números impares.
 */
public class QuantidadeParesImpares {

	public static void main(String[] args) {

		List<Integer> numeros = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int numerosPares = 0;
		int numerosImpares = 0;

		for (int i = 0; i < 10; i++) {

			System.out.println("Adicione um numero: ");
			numeros.add(scanner.nextInt());

			if (numeros.get(i) % 2 == 0) {
				numerosPares++;
			} else
				numerosImpares++;
		}
		System.out.println("Quantidade de números pares: " + numerosPares);
		System.out.println("Quantidade de números ímpares: " + numerosImpares);
	}

}
