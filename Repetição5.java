package JavaLa�oRepeti��o;

/* 5) Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
 * No final, mostre a soma dos n�meros digitados.(DO...WHILE)
 */

import java.util.Scanner;

public class Repeti��o5 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a, somaA = 0;
		
		System.out.println(" Digite 0 para Sair \n");
		
		do {	// Soma de todos os n�meros digitados, enquanto n�o for igual a zero.
			
			System.out.print(" Digite um n�mero: "); a = ler.nextInt();
			somaA += a;
			
		} while (a != 0);
		
		System.out.println("\n A soma dos n�meros digitados � igual a "+somaA+".");
		
	}
}
