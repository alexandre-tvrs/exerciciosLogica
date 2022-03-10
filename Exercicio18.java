package exerciciosLogica;

import java.util.Scanner;

public class Exercicio18 {
	
	private String extensoCDU(int n) {
		String nExtenso = "";
		
		int c = (int) (n/100);
		int d = (int) ((n/100)/10);
		int u = (int) ((n/100)%10);
		
		switch (c) {
		case 1: { nExtenso += "dez";		} break;
		case 2: { nExtenso += "dez";		} break;
		case 3: { nExtenso += "dez";		} break;
		case 4: { nExtenso += "dez";		} break;
		case 5: { nExtenso += "dez";		} break;
		case 6: { nExtenso += "dez";		} break;
		case 7: { nExtenso += "dez";		} break;
		case 8: { nExtenso += "dez";		} break;
		case 9: { nExtenso += "dez";		} break;
		}
		return nExtenso;
	}
	
	public void run() {
		Scanner input = new Scanner(System.in);
				
		System.out.println("Digite o valor que deseja ver por extenso: ");
		int n = input.nextInt();
		
		extensoCDU(n);
		
		input.close();
	}
}