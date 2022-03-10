package exerciciosLogica;

import java.util.Scanner;

public class Exercicio24 {
	public void run() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int numero = input.nextInt();
		
		int n = 0;
		
		System.out.println("Usando While");
		while (n <= 20) {
			System.out.println(numero + " x " + n + " = " + (numero*n));
			n++;
		}
		
		System.out.println("Usando Do-While");
		do {
			System.out.println(numero + " x " + n + " = " + (numero*n));
			n++;
		} while (n <= 20);
		
		System.out.println("Usando FOR");
		for(n = 0; n <= 20; n++) {
			System.out.println(numero + " x " + n + " = " + (numero*n));
		}
		input.close();
	}
}
