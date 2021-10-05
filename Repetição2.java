package JavaLaçoRepetição;

/* 2) Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR) */

import java.util.Scanner;

public class Repetição2 {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		int i, contPar = 0, contImpar = 0;
		
		for (i = 0; i < 10; i++) {	// Contador de quantos números são PARES e IMPARES.
			int a;
			System.out.printf(" Digite o %dº número: ",i+1); a = ler.nextInt();
			if (a % 2 == 0) { contPar++; } else { contImpar++; }
		}
		
		System.out.println("\n Destes números, "+contPar+" são PARES e "+contImpar+" são IMPARES!");
		
	}
}
