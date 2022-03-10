package exerciciosLogica;

import java.util.Scanner;

public class Exercicio28 {
	public void run() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("digite true ou false");
		boolean a = input.nextBoolean();
		System.out.println("digite true ou false");
	    boolean b = input.nextBoolean();;
	    System.out.println("digite true ou false");
	    boolean c = input.nextBoolean();

	    System.out.println("A e B = " + (a && b));
	    System.out.println("A e C = " + (a && c));
	    System.out.println("B e C = " + (b && c));
	    System.out.println("A e B e C = " + (a && b && c));
		input.close();
	}
}
