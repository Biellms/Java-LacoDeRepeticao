package JavaLa�oRepeti��o;

/* 6) Escrever um programa que receba v�rios n�meros inteiros no teclado. 
 * E no final imprimir a m�dia dos n�meros m�ltiplos de 3. 
 * Para sair digitar 0(zero).(DO...WHILE)
 */

import java.util.Scanner;

public class Repeti��o6 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a, somaA = 0, cont = 0;
		float mediaS = 0;
		
		System.out.println(" Digite 0 para Sair \n");
		
		do {	// Imprime a m�dia dos n�meros m�ltiplos de 3.
			
			System.out.print(" Digite um n�mero: "); a = ler.nextInt();
			
			if (a % 3 == 0 && a != 0) {	   // Condicional para fazer a soma dos m�ltiplos e sua m�dia.
				cont++;
				somaA += a; }
			
		} while (a != 0);
		
		mediaS = somaA / cont;
		System.out.printf("\n A m�dia dos m�ltiplos de 3 � igual a %.1f.",mediaS);
		
	}
}
