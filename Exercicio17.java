package exerciciosLogica;

import java.util.Scanner;

public class Exercicio17 {

	public void run() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite uma quantidade de segundos: ");
		int segundos = input.nextInt();
		
		if (segundos < 0) {
			System.out.println("Nao foi possivel efetuar a operacao");
		}
		else {
			System.out.println("Valor em hora : " + (segundos/3600) + "h");
		}
		
		input.close();
	}
}