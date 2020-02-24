package br.com.java.numerosImpares;

/*
Faça um programa que imprima na tela apenas os números ímpares
entre 1 e 50.
 */
public class NumerosImpares {

	public static void main(String[] args) {

		for (int i = 1; i < 50; i++) {

			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
	}

}
