package Lista1;

import java.util.Scanner;

public class Questão42 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] Numeros = new int[20];
        int[] Numeros_Pares = new int[20];
        int[] Numeros_Impares = new int[20];
        int Contador_Par = 0, Contador_Impar = 0;

        for (int i = 0; i < 20; i++){
            System.out.println("Digite o "+(i+1)+" numero: ");
            Numeros[i] = teclado.nextInt();

            if (Numeros[i] % 2 == 0){
                Numeros_Pares[i] = Numeros[i];
                Contador_Par++;


            } else if (Numeros[i] % 2 == 1) {
                Numeros_Impares[i] = Numeros[i];
                Contador_Impar++;
            }
        }


        System.out.println("Vetor Geral: ");
        for (int i = 0; i < 20; i++){
            System.out.printf("%d ", Numeros[i]);
        }
        System.out.println("\n");


        System.out.println("Vetor de Numeros Pares: ");
        for (int i = 0; i < Contador_Par; i++){
            System.out.printf("%d ", Numeros_Pares[i]);
        }
        System.out.println("\n");

        System.out.println("Vetor Impares: ");
       for (int i = 0; i < Contador_Impar; i++){
           System.out.printf("%d ", Numeros_Impares[i]);
           System.out.println("\n");
       }
    }
}
