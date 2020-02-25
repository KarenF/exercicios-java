package br.com.java.fibonacci;

import java.util.Scanner;

/*
A série de Fibonacci é formada pela seqüência
1,1,2,3,5,8,13,21,34,55,... Faça um programa capaz de gerar a série
até o n−ésimo termo.
 */
public class Fibonacci {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o número final da sequência: ");
		int n = scanner.nextInt();

		for (int i = 0; i <= n; i++)
			System.out.println("Fibonacci " + i + ": " + Fibonacci.fibo(i));
	}

	static long fibo(int n) {
		if (n < 2)
			return n;
		else
			return fibo(n - 1) + fibo(n - 2);
	}

}