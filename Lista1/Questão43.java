package Lista1;

import java.util.Scanner;

public class Questão43 {
	public static float Media(float Nota1, float Nota2, float Nota3, float Nota4){
		return (Nota1 + Nota2 + Nota3 + Nota4) / 4;
	}

	public static void main(String[] args) {
		Scanner Teclado = new Scanner(System.in);

		float [][] Planilha = new float[10][4];
		float[] Vetor_Media = new float[10];
		int Aprovados = 0;

		for (int Aluno = 0; Aluno <10; Aluno++) {
			for (int Nota = 0; Nota < 4; Nota++) {
				System.out.println("Insira a nota "+(Nota +1)+" do aluno "+(Aluno +1)+":");
				Planilha[Aluno][Nota] = Teclado.nextFloat();

			}
		}
		for (int Aluno = 0; Aluno < 10; Aluno++) {
			Vetor_Media[Aluno] = Media(Planilha[Aluno][0], Planilha[Aluno][1], Planilha[Aluno][2], Planilha[Aluno][3]);

			if (Vetor_Media[Aluno] >= 7){
				Aprovados++;

			}
		}
		System.out.println((Aprovados)+ " Alunos foram aprovados.");
	}
}
