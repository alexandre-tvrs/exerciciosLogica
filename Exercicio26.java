package exerciciosLogica;

import java.util.Scanner;

public class Exercicio26 {
	public void run() {
		Scanner input = new Scanner(System.in);
		
		float valor, soma = 0;

		System.out.println("Pressione 0 para parar");
		do {
			System.out.println("Digite um valor");
			valor = input.nextFloat();
			soma += valor;
		
		} while (valor != 0);
		
		System.out.println("Soma total: " + soma);
		
		input.close();
	}
}
