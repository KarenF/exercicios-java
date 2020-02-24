package br.com.java.validaInformacoes;

import java.util.Scanner;

public class Validacoes {

	Scanner scanner = new Scanner(System.in);

	public String validaNome() {

		String nome;

		do {
			System.out.println("Insira o nome: ");
			nome = scanner.next();
			if (nome.length() < 4)
				System.out.println("O nome deve conter mais do que 3 caracteres");
		} while (nome.length() < 4);
		return nome;
	}

	public int validaIdade() {

		int idade;

		do {
			System.out.println("Insira a idade: ");
			idade = scanner.nextInt();
			if (idade < 0 || idade > 150)
				System.out.println("A idade deve ser entre 0 e 150");
		} while (idade < 0 || idade > 150);

		return idade;
	}

	public String validaSalario() {

		String salario = "0";

		try {
			do {
				System.out.println("Insira o salário: ");
				salario = scanner.next();
				if (Integer.valueOf(salario) <= 0)
					System.out.println("O salário deve ser maior do que 0");
			} while (Integer.valueOf(salario) <= 0);
		} catch (Exception e) {
			return salario;
		}
		return salario;
	}

	public char validaGenero() {

		char genero;

		do {
			System.out.println("Insira o gênero: ");
			genero = scanner.next().charAt(0);
			char upperGenero = Character.toUpperCase(genero);
			
			switch (upperGenero) {
			case 'M':
				return genero;
			case 'F':
				return genero;
			case 'O':
				return genero;
			default:
				System.out.println("Opções de gênero: m - f - o");
			}

		} while ("mMfFoO".indexOf(genero) != 1);

		return genero;
	}
}
