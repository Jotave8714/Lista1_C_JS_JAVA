package Lista1;

import java.util.Scanner;

public class Questão46 {
	public static void main(String[] args) {
		Scanner Teclado = new Scanner(System.in);

		int[] Vetor1 = new int[10];
		int[] Vetor2 = new int[10];
		int[] Vetor_Intercalado = new int[20];
		int Contador_Impar = 0, Contador_Par = 0;

		for (int Contador = 0; Contador < 10; Contador++) {
			System.out.println("Insira o "+(Contador + 1)+" valor do Vetor 1: ");

			Vetor1[Contador] = Teclado.nextInt();
		}

		for (int Contador = 0; Contador < 10; Contador++) {
			System.out.println("Insira o "+(Contador + 1)+" valor do Vetor 2: ");
			Vetor2[Contador] = Teclado.nextInt();

		}
		for (int Contador = 0; Contador < 20; Contador++) {
			if (Contador % 2 == 0) {
				Vetor_Intercalado[Contador] = Vetor1[Contador_Par];
				Contador_Par++;

			} else if (Contador % 2 == 1) {
				Vetor_Intercalado[Contador] = Vetor2[Contador_Impar];
				Contador_Impar++;

			}
		}
		System.out.println("Apresentação do Vetor Intercalado");

		for (int Cont = 0; Cont < 20; Cont++){
			System.out.printf("%d ", Vetor_Intercalado[Cont]);
		}
		System.out.println("");
	}
}
