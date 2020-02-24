package br.com.java.calculaDias;

import java.text.ParseException;
import java.util.Scanner;

public class CalculoTempoDias {

	public static void main(String[] args) throws ParseException {

		Scanner scanner = new Scanner(System.in);
		System.out.print("data: ");
		String str = scanner.nextLine();

		String[] separaData = str.split("-");
		String dia = separaData[0];
		String mes = separaData[1];
		String ano = separaData[2];
		int diaInt = Integer.parseInt(dia);
		int mesInt = Integer.parseInt(mes) * 30;
		int anoInt = Integer.parseInt(ano) * 365;
		System.out.println(diaInt + mesInt + anoInt);

		scanner.close();
	}
}
