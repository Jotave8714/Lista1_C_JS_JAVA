package Lista1;

import java.util.Scanner;

public class Questão45 {
	public static void main(String[] args) {

		Scanner Teclado = new Scanner(System.in);

		int[] Idade = new int[5];
		float[] Altura = new float [5];

		for (int Pessoa = 0; Pessoa < 5; Pessoa++) {
			System.out.println("Insira a Idade da "+(Pessoa + 1)+" pessoa: ");
			Idade[Pessoa] = Teclado.nextInt();

			System.out.println("Insira a Altura da "+(Pessoa + 1)+" pessoa: ");
			Altura[Pessoa] = Teclado.nextFloat();

		}
		System.out.println("Vetor de Idade Invertido: ");
		for(int Pessoa = 4; Pessoa >= 0; Pessoa--) {
			System.out.print(Idade[Pessoa]);
		}
		System.out.println("");

		System.out.println("Vetor de Altura Invertido: ");
		for(int Pessoa = 4; Pessoa >= 0; Pessoa--) {
			System.out.print(Altura[Pessoa]);
		}
		System.out.println("");


	}
}
