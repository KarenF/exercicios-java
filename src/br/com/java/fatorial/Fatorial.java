package br.com.java.fatorial;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro
fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120
 */
public class Fatorial {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o número escolhido para o cálculo do fatorial: ");
		int fatorial = scanner.nextInt();
		int resultado = fatorial(fatorial);
		
		if(resultado == -1)
			System.out.println("O número deve ser maior do que zero");
		else
			System.out.println("Fatorial do número " + fatorial + " = " + resultado);

		scanner.close();
	}

	static int fatorial(int fatorial) {
		if (fatorial == 0 || fatorial == 1)
			return 1;
		else if (fatorial < 0)
			return -1;
		else
			return fatorial(fatorial - 1) * fatorial;
	}

}
