package Lista1;

import java.util.Scanner;

public class Questão44 {
	public static void main(String[] args) {

		Scanner Teclado = new Scanner(System.in);

		int[] Vetor_Numeros = new int[5];
		int Soma = 0, Multiplicacao = 1;

		for (int Contagem = 0; Contagem < Vetor_Numeros.length; Contagem++) {
			System.out.println("Digite o "+(Contagem+1)+" numero: ");
			Vetor_Numeros[Contagem] = Teclado.nextInt();
			Soma += Vetor_Numeros[Contagem];
			Multiplicacao = (Multiplicacao * Vetor_Numeros[Contagem]);

		}
		System.out.println("O valor da Soma dos numeros e: "+(Soma));

		System.out.println("O Multiplicacao dos numeros e: "+(Multiplicacao));

		System.out.println("Apresentação do Vetor de Numeros:");
		for (int Contagem = 0; Contagem < Vetor_Numeros.length; Contagem++) {
			System.out.print(Vetor_Numeros[Contagem]+" ");

		}
		System.out.println("");
	}
}
