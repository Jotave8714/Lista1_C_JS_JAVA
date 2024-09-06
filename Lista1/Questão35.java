package Lista1;

import java.util.Scanner;

public class Questão35 {
	public static void main(String[] args) {
		int Numero, Divisores = 0;
		Scanner Teclado = new Scanner(System.in);
		System.out.println("Insira um numero para descobrir se ele e primo");
		Numero = Teclado.nextInt();
		for (int Divisor = 1; Divisor <= Numero; Divisor++) {
			if (Numero % Divisor == 0) {
				Divisores++;
			}
		}
		if (Divisores == 2) {
			System.out.println("O numero inserido e primo");
		} else {
			System.out.println("O numero inserido nao e primo");
		}
	}
}
