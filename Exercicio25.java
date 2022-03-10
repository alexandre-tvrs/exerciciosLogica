package exerciciosLogica;

import java.util.Scanner;

public class Exercicio25 {
	public void run() {
		Scanner input = new Scanner(System.in);
		
		float valor, soma = 0;

		for (;;) {
			System.out.println("Digite um valor");
			valor = input.nextFloat();
			soma += valor;
			System.out.println("Soma: " + soma);
		}		
	}
}
