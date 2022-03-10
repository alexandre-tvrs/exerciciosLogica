package exerciciosLogica;

import java.util.Scanner;

public class Exercicio23 {
	public void run() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite a posicao inicial: ");
		float pv = input.nextFloat();	
		System.out.print("Digite a velocidade: ");
		float j = input.nextFloat();	
		System.out.print("Digite o tempo: ");
		int n = input.nextInt();	
		
		float fv = (float) (pv * Math.pow((1 + j), n));
		
		System.out.println("O valor de capital eh: " + fv);
		
		input.close();
	}
}
