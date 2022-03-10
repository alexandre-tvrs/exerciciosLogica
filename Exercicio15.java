package exerciciosLogica;

import java.util.Scanner;

public class Exercicio15 {

	public void run() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite uma valor para X: ");
		int x = input.nextInt();	
		System.out.print("Digite uma valor para Y: ");
		int y = input.nextInt();	
		
		System.out.println("X + Y = " + (x + y));
		System.out.println("X + Y = " + (x * y));
		
		if (x > y) {
			System.out.println("X > Y");
		} else {
			System.out.println("Y > X");
		}
		if (x == y) {
			System.out.println("X = Y");
		} else {
			System.out.println("X != Y");
		}
		
		input.close();
	}
}