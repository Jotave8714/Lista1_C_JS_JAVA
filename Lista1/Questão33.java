package Lista1;

import java.util.Scanner;

public class Questão33 {

	public static void main(String[] args) {
		Scanner Teclado = new Scanner(System.in);

		int Numero1, Numero2, Numero3, Maior, Menor;

		System.out.println("Insira o Valor do Numero1:");
		Numero1 = Teclado.nextInt();
		System.out.println("Insira o Valor do Numero2:");
		Numero2 = Teclado.nextInt();
		System.out.println("Insira o Valor do Numero3:");
		Numero3 = Teclado.nextInt();

		if (Numero1 > Numero2 && Numero1 > Numero3) {
			Maior = Numero1;
		} else if (Numero2 > Numero1 && Numero2 > Numero3) {
			Maior = Numero2;
		} else {
			Maior = Numero3;
		}

		if (Numero1 < Numero2 && Numero1 < Numero3) {
			Menor = Numero1;
		} else if (Numero2 < Numero1 && Numero2 < Numero3) {
			Menor = Numero2;
		} else {
			Menor = Numero3;
		}

		System.out.println("O Maior numero é: " + Maior);
		System.out.println("O Menor numero é: " + Menor);
	}
}
