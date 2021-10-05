package JavaLaçoRepetição;

/*
Desenvolver um sistema para saber a característica psicológica dos indivíduos de uma região. 
Para tanto a cada pessoa era perguntado idade, sexo (1-feminino/ 2-masculino), 
e as opcoes (1- se a pessoa era calma; 2- se a pessoa era nervosa; 3- se a pessoa era agressiva).
pede-se elaborar um sistema que permita ler os dados de 150 pessoas calcule e mostre. 
- Número de pessoas calmas;
- Número de mulheres nervosas;
- Número de homens agressivos;
- Número de outros calmos;
- Número de pessoas nervosas com mais de 40 anos;
- Núumero de pessoas calmas com menos de 18 anos;
*/

import java.util.Scanner;
import java.util.Random;	// Biblioteca para automatizar o processo, usando números aleatórios

public class Repetição4 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);	// Não está sendo usado
		Random sorteia = new Random();			// Está sendo usado
		
		int cont = 0, idade, sexo, carater, pessoasCalmas = 0, mulheresNerv = 0, homensAgr = 0, outrosCalmos = 0, pNervosas40 = 0, pCalmos18 = 0;
		
		while (cont < 150) {
			
			System.out.print("\n Digite a idade da pessoa: "); idade = sorteia.nextInt(100)+1; System.out.printf("%d",idade);
			
			System.out.print("\n Digite o sexo ");
			System.out.print("\n 1) Feminino\n 2) Masculino\n 3) Outros "); sexo = sorteia.nextInt(3)+1;
			System.out.println("\n Opção: "+sexo);
			
			System.out.print(" Digite a Característica Psicológica: ");
			System.out.print("\n 1) Calma\n 2) Nervosa\n 3) Agressiva"); carater = sorteia.nextInt(3)+1;
			System.out.println("\n Opção: "+carater);
			System.out.println();
			
			if (carater == 1) { pessoasCalmas++; }				// Contador pessoas calmas
			if (sexo == 1 && carater == 2) { mulheresNerv++; }	// Contador mulheres nervosas
			if (sexo == 2 && carater == 3) { homensAgr++; }		// Contador homens agressivos
			if (sexo == 3 && carater == 1) { outrosCalmos++; }	// Contador outros calmos
			if (idade > 40 && carater == 2) { pNervosas40++; } 	// Contador nervosos acima de 40 anos
 			if (idade < 18 && carater == 1) { pCalmos18++; }	// Contador calmos abaixo de 18 anos
			
			cont++;
			
		}
		
		System.out.println("\n Número de PESSOAS CALMAS: "+pessoasCalmas);
		System.out.println(" Número de MULHERES NERVOSAS: "+mulheresNerv);
		System.out.println(" Número de HOMENS AGRESSIVOS: "+homensAgr);
		System.out.println(" Número de OUTROS CALMOS : "+outrosCalmos);
		System.out.println(" Número de PESSOAS NERVOSAS ACIMA DE 40 ANOS: "+pNervosas40);
		System.out.println(" Número de PESSOAS CALMAS ABAIXO DE 18 ANOS: "+pCalmos18);
	}
}
