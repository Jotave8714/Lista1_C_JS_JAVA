package Lista1;

import java.util.Scanner;

public class Questão36 {
	public static void main(String[] args) {
		Scanner Teclado = new Scanner(System.in);

		int Numero1, Numero2, Numero3, Maior, Menor;

		System.out.println("Insira o Primeiro Numero");
		Numero1 = Teclado.nextInt();

		System.out.println("Insira o Segundo Numero");
		Numero2 = Teclado.nextInt();

		if (Numero1 >= Numero2) {
			Maior = Numero1;
			Menor = Numero2;
		} else {
			Maior = Numero2;
			Menor = Numero1;
		}

		System.out.println("Insira o numero de comparacao para saber se ele esta no intervalo");
		Numero3 = Teclado.nextInt();

		if (Maior > Numero3 && Menor < Numero3) {
			System.out.println("O numero de comparacao esta no intervalo!");
		} else {
			System.out.println("O numero de comparacao NAO esta no intervalo!");
		}

		Teclado.close();
	}
}
