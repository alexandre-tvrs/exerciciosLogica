package exerciciosLogica;

import java.util.Scanner;

public class Exercicio20 {

	public void run() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite uma quantidade em metros: ");
		float metros = input.nextFloat();
		
		if (metros < 0) {
			System.out.println("Nao foi possivel efetuar a operacao");
		}
		else {
			System.out.println("Valor em pes : " + (metros*3.315) + " pes");
		}
		
		input.close();
	}
}