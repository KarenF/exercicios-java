package br.com.java.validaInformacoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Faça um programa que leia e valide as seguintes informações:
a. Nome: maior que 3 caracteres;
b. Idade: entre 0 e 150;
c. Salário: maior que zero;
d. Sexo: 'f' ou 'm';
e. Estado Civil: 's', 'c', 'v', 'd'.
 */
public class ValidaInformacoes {

	public static void main(String[] args) {

		Validacoes validacoes = new Validacoes();
		
		String nome = validacoes.validaNome();
		System.out.println("Nome: " + nome);
		
		int idade = validacoes.validaIdade();
		System.out.println("Idade: " + idade);
	}

}
