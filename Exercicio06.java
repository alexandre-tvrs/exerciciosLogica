package exerciciosLogica;

import java.util.Scanner;

public class Exercicio06 {	
	public void run() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um valor para A: ");
		float a = input.nextFloat();
		System.out.print("Digite um valor para B: ");
		float b = input.nextFloat();
		
		System.out.println(" (a) A eh maior que zero? " + ((a >0) ? "verdadeiro" : "falso"));
		System.out.println(" (b) B eh maior que zero?"  + ((b >0) ? "verdadeiro" : "falso"));
		System.out.println(" (c) A E B sao maiores do que zero?" + (((a >0)&&(b >0)) ? "verdadeiro" : "falso"));
		
		input.close();
	}
}
