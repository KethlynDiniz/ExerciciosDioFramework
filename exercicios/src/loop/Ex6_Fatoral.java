package loop;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/

public class Ex6_Fatoral {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner (System.in)){
			
			int fatoral;
			
			System.out.println("Digite um fatoral: ");
			fatoral = scan.nextInt();
			
			int multiplicacao = 1;
			
			System.out.print(fatoral +"! = ");
	        for(int i = fatoral ; i >= 1 ; i --) {
	            multiplicacao = multiplicacao * i;
	        }

	        System.out.println(multiplicacao);
			
		}
	}

}
