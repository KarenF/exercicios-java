package br.com.java.numeroPrimo;

import java.util.Scanner;

/*
Faça um programa que peça um número inteiro e determine se ele é
ou não um número primo. Um número primo é aquele que é divisível
somente por ele mesmo e por 1.
 */
public class NumeroPrimo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual número você deseja saber se é primo? ");
		int primo = scanner.nextInt();
		int contador = 0;

		for (int i = 1; i <= primo; i++) {
			if (primo % i == 0)
				contador++;
		}
		
		if(contador > 2)
			System.out.println("O número " + primo + " não é primo");
		else
			System.out.println("O número " + primo + " é primo");

		scanner.close();
	}

}
