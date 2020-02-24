package br.com.java.nomeSenha;

import java.util.Scanner;

/*
Faça um programa que leia um nome de usuário e a sua senha e não
aceite a senha igual ao nome do usuário, mostrando uma mensagem
de erro e voltando a pedir as informações.
 */
public class NomeSenha {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String nome, senha;
		
		do {
			System.out.println("Insira o nome: ");
			nome = scanner.next();
			System.out.println("Insira a senha: ");
			senha = scanner.next();
		} while (nome.equals(senha));
		
		System.out.println("Nome: " + nome + " - Senha: " + senha);
	}

}
