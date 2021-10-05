package JavaLaçoRepetição;

/* 5) Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
 * No final, mostre a soma dos números digitados.(DO...WHILE)
 */

import java.util.Scanner;

public class Repetição5 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a, somaA = 0;
		
		System.out.println(" Digite 0 para Sair \n");
		
		do {	// Soma de todos os números digitados, enquanto não for igual a zero.
			
			System.out.print(" Digite um número: "); a = ler.nextInt();
			somaA += a;
			
		} while (a != 0);
		
		System.out.println("\n A soma dos números digitados é igual a "+somaA+".");
		
	}
}
