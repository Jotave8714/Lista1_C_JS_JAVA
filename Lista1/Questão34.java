package Lista1;

import java.util.Scanner;

public class Questão34 {
	public static void main(String[] args) {
		Scanner Teclado = new Scanner(System.in);

		int[] Numero = new int[10];
		int Maior = 0, Menor = 2000000, Soma = 0, Media;

		for (int Contagem = 0; Contagem < 10; Contagem++) {
			System.out.printf("Insira o valor do %d numero: \n", Contagem + 1);
			Numero[Contagem] = Teclado.nextInt();
			Soma = Soma + Numero[Contagem];
			if (Numero[Contagem] >= Maior) {
				Maior = Numero[Contagem];
			}
			if (Numero[Contagem] <= Menor) {
				Menor = Numero[Contagem];
			}
			System.out.println();
		}

		System.out.printf("\nO Menor numero inserido foi: %d\n", Menor);
		System.out.printf("O Maior numero inserido foi: %d\n", Maior);
		System.out.printf("A Soma dos numeros foi: %d\n", Soma);
		Media = Soma / 10;
		System.out.printf("A Media dos numeros foi: %d\n", Media);
	}
}
