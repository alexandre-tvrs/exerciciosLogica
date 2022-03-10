package exerciciosLogica;

import java.util.Scanner;

public class Exercicio12 {

	public void run() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o numero de copos a serem comprados: ");
		double qCopos = input.nextDouble();		
		if ( qCopos <= 100) { 
			System.out.println("Valor dos copos: R$0.05");
			System.out.print("Valor total: R$" + qCopos * 0.05);
		} else {
			if ( qCopos > 100 && qCopos < 500) {
				System.out.println("Valor dos copos: R$0.04");
				System.out.print("Valor total: R$" + qCopos * 0.04);
			} else {
				System.out.println("Valor dos copos: R$0.04");
				System.out.print("Valor total: R$" + qCopos * 0.035);
			}
			}
		input.close();
	}
}