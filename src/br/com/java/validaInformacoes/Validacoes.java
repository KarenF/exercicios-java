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
}
