package exerciciosLogica;

import java.util.Scanner;

public class Exercicio21 {
	public void run() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o valor de a: ");
		int a = input.nextInt();
		System.out.print("Digite o valor de b: ");
		int b = input.nextInt();
		System.out.print("Digite o valor de c: ");
		int c = input.nextInt();
		
		int delta =  (b * b) - (4 * a * c);
		
		if (delta >= 0) {
			int x1 = (int) ((-(b) + Math.sqrt(delta)) / 2 * a);
			int x2 = (int) ((-(b) - Math.sqrt(delta)) / 2 * a);
			
			System.out.println("Valor de x1 = " + x1);
			System.out.println("Valor de x2 = " + x2);
		} else {
			System.out.println("Delta nao possui raiz");
		}
		
		
		
		input.close();
	}
}
