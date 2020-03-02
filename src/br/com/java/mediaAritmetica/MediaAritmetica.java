package br.com.java.mediaAritmetica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Faça um programa que calcule o mostre a média aritmética de N
notas.
 */
public class MediaAritmetica {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite as notas: ");
		List<Double> notas = new ArrayList<>();

		while (scanner.hasNextDouble()) {
			notas.add(scanner.nextDouble());
		}

		scanner.close();

		double media = notas.stream().mapToDouble(Double::doubleValue).sum();
		System.out.println("Quantidade de notas: " + notas.size());
		System.out.println("Notas: " + notas);
		System.out.println("Média: " + media / notas.size());
	}
}
