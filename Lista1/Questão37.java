package Lista1;

import java.util.Scanner;

public class Questão37 {
	public static void main(String[] args) {
		int Numero;
		Scanner Teclado = new Scanner(System.in);

		while (true) {
			System.out.println("Insira um numero entre 12 e 20: ");
			Numero = Teclado.nextInt();
			if (Numero > 12 && Numero < 20) {
				System.out.println("O numero digitado foi " + Numero);
				break;
			} else {
				System.out.println("entrada Invalida");
			}
		}
	}
}
