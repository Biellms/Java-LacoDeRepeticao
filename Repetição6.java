package JavaLaçoRepetição;

/* 6) Escrever um programa que receba vários números inteiros no teclado. 
 * E no final imprimir a média dos números múltiplos de 3. 
 * Para sair digitar 0(zero).(DO...WHILE)
 */

import java.util.Scanner;

public class Repetição6 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a, somaA = 0, cont = 0;
		float mediaS = 0;
		
		System.out.println(" Digite 0 para Sair \n");
		
		do {	// Imprime a média dos números múltiplos de 3.
			
			System.out.print(" Digite um número: "); a = ler.nextInt();
			
			if (a % 3 == 0 && a != 0) {	   // Condicional para fazer a soma dos múltiplos e sua média.
				cont++;
				somaA += a; }
			
		} while (a != 0);
		
		mediaS = somaA / cont;
		System.out.printf("\n A média dos múltiplos de 3 é igual a %.1f.",mediaS);
		
	}
}
