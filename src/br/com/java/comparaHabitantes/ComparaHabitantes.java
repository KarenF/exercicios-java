package br.com.java.comparaHabitantes;

import java.util.Scanner;

/*
Supondo que a população de um país A seja da ordem de 80000
habitantes com uma taxa anual de crescimento de 3% e que a
população de B seja 200000 habitantes com uma taxa de crescimento
de 1.5%. Faça um programa que calcule e escreva o número de anos
necessários para que a população do país A ultrapasse ou iguale a
população do país B, mantidas as taxas de crescimento.
 */
public class ComparaHabitantes {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int populacaoA;
		int populacaoB;
		int anos = 0;
		char repetirComparacao;

		do {
			System.out.println("Adiciona o número de habitantes do país A: ");
			populacaoA = scanner.nextInt();
			System.out.println("Adiciona o número de habitantes do país B: ");
			populacaoB = scanner.nextInt();
			
			System.out.println("Adiciona a taxa anual de crescimento do país A: ");
			double taxaCrescimentoA = scanner.nextDouble();
			System.out.println("Adiciona a taxa anual de crescimento do país B: ");
			double taxaCrescimentoB = scanner.nextDouble();
			do {
				populacaoA += (populacaoA * taxaCrescimentoA);
				populacaoB += (populacaoB * taxaCrescimentoB);
				anos++;
			} while (populacaoA < populacaoB);

			System.out
					.println("Anos necessários para a população do país A ultrapassar a população do país B: " + anos);
			anos = 0;
			System.out.println("Você deseja realizar nova comparação? (S/s para sim)");
			repetirComparacao = scanner.next().charAt(0);
		} while (repetirComparacao == 'S' || repetirComparacao == 's');

		if(repetirComparacao != 'S' || repetirComparacao != 's')
			System.out.println("Fim");
	}

}
