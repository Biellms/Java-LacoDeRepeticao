package JavaLa�oRepeti��o;

/* 2) Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR) */

import java.util.Scanner;

public class Repeti��o2 {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		int i, contPar = 0, contImpar = 0;
		
		for (i = 0; i < 10; i++) {	// Contador de quantos n�meros s�o PARES e IMPARES.
			int a;
			System.out.printf(" Digite o %d� n�mero: ",i+1); a = ler.nextInt();
			if (a % 2 == 0) { contPar++; } else { contImpar++; }
		}
		
		System.out.println("\n Destes n�meros, "+contPar+" s�o PARES e "+contImpar+" s�o IMPARES!");
		
	}
}
