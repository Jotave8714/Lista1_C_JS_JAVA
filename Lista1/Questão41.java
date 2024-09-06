package Lista1;

import java.util.Scanner;

public class Questão41 {

	public static void main(String[] args) {
		Scanner Teclado = new Scanner(System.in);
		int[] Lado = new int[3];

		for (int lado = 0; lado < 3; lado++) {
			System.out.println("Insira o Lado " + (lado + 1));
			Lado[lado] = Teclado.nextInt();

			while (Lado[lado] <= 0) {
				System.out.println("Valor invalido, insira o lado " + (lado + 1) + " novamente");
				Lado[lado] = Teclado.nextInt();
			}
		}

		if (Lado[0] < Lado[1] + Lado[2] && Lado[1] < Lado[0] + Lado[2] && Lado[2] < Lado[0] + Lado[1]) {
			System.out.println("Os Valores formam um triangulo!");

			if (Lado[0] == Lado[1] && Lado[0] == Lado[2]) {
				System.out.println("O triangulo e Equilatero!");
			} else if (Lado[0] == Lado[1] || Lado[0] == Lado[2] || Lado[1] == Lado[2]) {
				System.out.println("O triangulo e Isoceles!");
			} else {
				System.out.println("O triangulo e Escaleno!");
			}
		} else {
			System.out.println("Os Valores nao formam um triangulo!");
		}
	}
}

