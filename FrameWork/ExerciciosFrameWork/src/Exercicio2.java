//Desafio
//Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.
//
//Entrada
//O arquivo de entrada contém um valor inteiro N na primeira linha. Cada N linha a seguir contém um caso de teste com três valores com uma casa decimal cada valor.
//
//Saída
//Para cada caso de teste, imprima a média ponderada dos 3 valores, conforme exemplo abaixo.
//
// 
//Exemplo de Entrada	Exemplo de Saída
//3                       5.7
//6.5 4.3 6.2             6.3
//5.1 4.2 8.1             9.3
//8.0 9.0 10.0

import java.util.*;
 
public class Exercicio2
{
    public static void main(String[] args)
    {
       try (Scanner input = new Scanner(System.in)) {
		int casos = input.nextInt();
        int cont = 0;
        while (cont < casos){
 
            double a = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();
	
	   // TODO: complete os espaços em branco com sua solução para o problema
            double mediaPonderada= ((a*2)+(b*3)+(c*5))/10;
            System.out.println(String.format("%.1f", mediaPonderada));


              
            cont++;
            }
	}
        
    }
    }