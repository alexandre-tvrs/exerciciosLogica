package exerciciosLogica;

import java.util.Scanner;

public class Exercicio22 {
	public void run() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite a posicao inicial: ");
		float p0 = input.nextFloat();	
		System.out.print("Digite a velocidade: ");
		float v = input.nextFloat();	
		System.out.print("Digite a aceleracao: ");
		float a = input.nextFloat();	
		System.out.print("Digite o tempo: ");
		int t = input.nextInt();	
		
		float pf = (p0 + ((v * t) + (a * (t * t)))) / 2;
		
		System.out.println("A posicao final eh: " + pf);
		
		input.close();
	}
}
