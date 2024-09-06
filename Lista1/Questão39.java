package Lista1;

import java.util.Scanner;

public class Questão39 {
	public static void main(String[] args) {
		Scanner Teclado = new Scanner(System.in);

		int Idade, Contagem = 0, Soma = 0, Maior = 0, Menor = 2000;
		double Media;
		System.out.println("Para encerrar a leitura, Insira 0");

		while (true) {
			System.out.printf("Insira a idade da %d pessoa analizada: \n", Contagem + 1);
			Idade = Teclado.nextInt();
			Soma = Soma + Idade;

			if (Idade > Maior) {
				Maior = Idade;
			}

			if (Idade < Menor && Idade != 0) {
				Menor = Idade;
			}

			if (Idade == 0) {
				break;
			}

			Contagem++;
		}

		System.out.printf("%d pessoas foram analisadas\n", Contagem);
		Media = (double) Soma / Contagem;
		System.out.printf("A idade media do grupo e de %.2f anos \n", Media);
		System.out.printf("A MAIOR idade e de %d e a MENOR e de %d \n", Maior, Menor);

		Teclado.close();
	}
}

