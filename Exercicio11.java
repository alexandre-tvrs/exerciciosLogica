package exerciciosLogica;

import java.util.Scanner;

public class Exercicio11 {
	public void run() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um valor para A: ");
		int a = input.nextInt();
		System.out.print("Digite um valor para B: ");
		int b = input.nextInt();
		
		if ( (a % b == 0)) { 
			System.out.print("A eh multiplo de B");
		} else {
				if ( (b % a == 0)) { 
					System.out.print("B eh multiplo de A");
				} else {
					System.out.println("Nao sao multiplos");
				}
			}
		input.close();
	}
}