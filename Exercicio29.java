package exerciciosLogica;

import java.util.Scanner;

public class Exercicio29 {
	public void run() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("digite true ou false");
		boolean a = input.nextBoolean();
		System.out.println("digite true ou false");
	    boolean b = input.nextBoolean();;
	    System.out.println("digite true ou false");
	    boolean c = input.nextBoolean();

	    System.out.println("A ou B = " + (a || b));
	    System.out.println("A ou C = " + (a || c));
	    System.out.println("B ou C = " + (b || c));
	    System.out.println("A ou B ou C = " + (a || b || c));
		input.close();
	}
}
