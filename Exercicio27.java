package exerciciosLogica;

import java.util.Scanner;

public class Exercicio27 {
	public void run() {
		Scanner input = new Scanner(System.in);

		float nota = 0, somaNota = 0, n = 0; 
		
		do {
			System.out.print("Digite uma nota: ");
			nota = input.nextFloat();	
			if (nota > 0) {
			somaNota =+ nota;
			n++;
			}
		} while (nota > 0);
		n--;
		System.out.println("Media = " + (somaNota/n));
		input.close();
	}
}
