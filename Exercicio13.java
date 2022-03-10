package exerciciosLogica;

import java.util.Scanner;

public class Exercicio13 {

	public void run() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um lado: ");
		float ladoA = input.nextFloat();	
		System.out.print("Digite um lado: ");
		float ladoB = input.nextFloat();
		System.out.print("Digite um lado: ");
		float ladoC = input.nextFloat();
		if ( ladoA < ladoB + ladoC && ladoB < ladoC + ladoA && ladoC < ladoA + ladoB) { 
			if (ladoA != ladoB && ladoB != ladoC && ladoC != ladoA) {
				System.out.println("Eh um triangulo escaleno");
			}  else if (ladoA == ladoB && ladoB == ladoC) {
					System.out.println("Eh um triangulo equilatero");
				} else {
					System.out.println("Eh um trangulo isosceles");
				}
		} else {
			System.out.println("Nao eh um triangulo");
			}
		input.close();
	}
}