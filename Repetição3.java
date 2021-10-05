package JavaLaçoRepetição;

/* 3) Solicitar a idade de várias pessoas e imprimir: 
 * Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos. 
 * O programa termina quando idade for =-99. (WHILE)
*/

import java.util.Scanner;

public class Repetição3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a, cont21 = 0, cont50 = 0;
		
		System.out.print("\n Digite a idade: "); a = ler.nextInt();
		
		while (a != -99) {	// Contador de quantas pessoas possuem menos de 21 anos e mais de 50 anos.
			if (a<21) { cont21++; } if (a > 50) { cont50++; }
			System.out.print("\n Digite -99 para SAIR\n Digite a idade: "); a = ler.nextInt();
		}
		
		System.out.printf("\n Quantidade de pessoas com menos de 21 anos: %d",cont21);
		System.out.printf("\n Quantidade de pessoas com mais de 50 anos: %d",cont50);
		
	}
}
