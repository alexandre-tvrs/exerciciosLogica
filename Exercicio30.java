package exerciciosLogica;

import java.util.Scanner;

public class Exercicio30 {
	public void run() {
		Scanner input = new Scanner(System.in);
		
		int y = 0, x = 0; 
		
		System.out.println("Digite o valor do coeficiente a: ");
		int a = input.nextInt();
		System.out.println("Digite o valor do coeficiente b: ");
		int b = input.nextInt();
		System.out.println("Digite o valor do limite superior: ");
		int limiteS = input.nextInt();
		System.out.println("Digite o valor do limite inferior: ");
		int limiteI = input.nextInt();
		System.out.println("Digite o valor do incremento de X: ");
		int i = input.nextInt();
		
		System.out.println("x    ||    y");
		for(x = limiteI; x <= limiteS; x+=i) {
			y = ((a*x) + b);
			System.out.println(x +"  ||  " + y);
		}
		input.close();
	}
}
