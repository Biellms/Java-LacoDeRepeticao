package JavaLaçoRepetição;

/* 1) Informar todos os números de 1000 a 1999
   que quando divididos por 11 obtemos resto = 5. (FOR)
*/

public class Repetiçao1 {

	public static void main(String[] args) {
		
		int i, t;
		
		for (i = 1000; i <= 1999; i++) {
			
			if (i % 11 == 5) {	// Apenas números onde divididos por 11, o resto é = 5.
				System.out.println("\n "+i);	
			}
			
		}
	}
}
