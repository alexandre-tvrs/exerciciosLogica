package exerciciosLogica;

import java.util.Scanner;

public class Exercicio14 {

	public void run() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite uma nota: ");
		float notaA = input.nextFloat();	
		System.out.print("Digite uma nota: ");
		float notaB = input.nextFloat();	
		System.out.print("Digite uma nota: ");
		float notaC = input.nextFloat();	
		
		float media;
		
		media = (notaA + notaB + notaC) / 3;
		if ( media > 3) { 
			System.out.println("Media :" + media);
			System.out.println("Exame");
		} else if (media > 7) {
				System.out.println("Media :" + media);
				System.out.println("Aprovado");
			} else {
					System.out.println("Media :" + media);
					System.out.println("Reprovado");
				}
		input.close();
	}
}