package br.com.java.maiorNumero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
Faça um programa que leia 5 números e informe o maior número.

Faça um programa que leia 5 números e informe a soma e a média
dos números.
 */
public class MaiorNumero {

	public static void main(String[] args) {

		List<Integer> numeros = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Insira um número: ");
			numeros.add(scanner.nextInt());
		}
		
		numeros.sort((s1, s2) -> Integer.compare(s1, s2));
		System.out.println("Maior número digitado: " + Collections.max(numeros));
		
		double somaNumeros = numeros.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Soma dos números: " + somaNumeros);
		System.out.println("Média dos números: " + somaNumeros/5);
	}

}
