package Lista1;

import java.util.Scanner;

public class Questão38 {

	public static void main(String[] args) {
		Scanner Teclado = new Scanner(System.in);
		int[] Escala = new int[2];
		float Temperatura;

		System.out.println("Informe a sua Escala de Temperatura atual: (1- Fahrenheit, 2- Celsius, 3- Kelvin)");
		Escala[0] = Teclado.nextInt();
		System.out.println("Informe a Temperatura");
		Temperatura = Teclado.nextFloat();

		switch (Escala[0]) {
			case 1:
				System.out.println("Informe a Escala para conversao: (1- Celsius, 2- Kelvin)");
				Escala[1] = Teclado.nextInt();

				switch (Escala[1]) {
					case 1:
						Temperatura = (Temperatura - 32) / 1.8f;
						break;
					case 2:
						Temperatura = (Temperatura - 32) / 1.8f + 273.15f;
						break;
					default:
						System.out.println("Opcao invalida");
						break;
				}
				break;

			case 2:
				System.out.println("Informe a Escala para conversao: (1- Fahrenheit, 2- Kelvin)");
				Escala[1] = Teclado.nextInt();

				switch (Escala[1]) {
					case 1:
						Temperatura = (Temperatura * 1.8f) + 32;
						break;
					case 2:
						Temperatura = Temperatura + 273.15f;
						break;
					default:
						System.out.println("Opcao invalida");
						break;
				}
				break;

			case 3:
				System.out.println("Informe a Escala para conversao: (1- Fahrenheit, 2- Celsius)");
				Escala[1] = Teclado.nextInt();

				switch (Escala[1]) {
					case 1:
						Temperatura = (1.8f * (Temperatura - 273)) + 32;
						break;
					case 2:
						Temperatura = Temperatura - 273.15f;
						break;
					default:
						System.out.println("Opcao invalida");
						break;
				}
				break;

			default:
				System.out.println("Opcao invalida");
				break;
		}
		System.out.printf("A temperatura convertida e %.2f\n", Temperatura);
	}
}
