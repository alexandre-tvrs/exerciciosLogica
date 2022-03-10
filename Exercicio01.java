package exerciciosLogica;

import java.util.Scanner;

public class Exercicio01 {
	public void run() {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um valor inteiro: ");
		int valor = input.nextInt();
		System.out.println("O valor lido foi: " + valor);
		input.close();
	}
}
