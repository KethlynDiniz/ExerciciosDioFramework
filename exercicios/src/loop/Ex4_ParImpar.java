package loop;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

public class Ex4_ParImpar {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
		
		int quantNumeros;
		int numero;
		int quantPar = 0;
		int quantImpar = 0;
		
		System.out.println("Quantidade de números: ");
		quantNumeros = scan.nextInt();
		
		int count = 0;
		do {
			System.out.println("Insira Número: ");
			numero = scan.nextInt();
			
			if (numero % 2 == 0) quantPar++;
			else quantImpar++;
			
			count ++; //count = count + 1
		} while(count < quantNumeros);
		
		System.out.println("Quantidade de número par é: " + quantPar);
		System.out.println("Quantidade de número impar é: " + quantImpar);
		}
	}
}
