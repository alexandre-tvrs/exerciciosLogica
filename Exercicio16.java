package exerciciosLogica;

import java.util.Scanner;

public class Exercicio16 {

	public void run() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite a base do triangulo: ");
		float base = input.nextFloat();	
		System.out.print("Digite um lado: ");
		float altura = input.nextFloat();
		
		float area = (base*altura)/2;
		
		System.out.println("Area do triangulo = " + area);
		
		input.close();
	}
}