package Lista1;

import java.util.Scanner;

public class Questão40 {
	public static float media(float Nota1, float Nota2) {
		return (Nota1 + Nota2) / 2;
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		float maior;
		float [][] Planilha = new float[5][4];

		for (int Qntd_Alunos = 0; Qntd_Alunos < 5; Qntd_Alunos++) {
			for (int Qntd_Notas = 0; Qntd_Notas < 2; Qntd_Notas++) {
				System.out.printf("Informe a nota %d do aluno %d: \n", Qntd_Notas + 1, Qntd_Alunos + 1);
				Planilha[Qntd_Alunos][Qntd_Notas] = teclado.nextFloat();

			}
		}

		for (int Aluno = 0; Aluno < 5; Aluno++) {
			Planilha[Aluno][3] = media(Planilha[Aluno][0], Planilha[Aluno][1]);
			if (Planilha[Aluno][3] >= 5){
				System.out.printf("Aluno %d aprovado!\n", Aluno+1);
				Planilha[Aluno][2] = 0;

			}else {
				System.out.printf("Aluno %d reprovado e precisa fazer a prova 3\n", Aluno+1);
				System.out.printf("Insira a nota da Av3 do Aluno %d \n", Aluno+1);
				Planilha[Aluno][2] = teclado.nextFloat();

				if (Planilha[Aluno][0] >= Planilha[Aluno][1]){
					maior = Planilha[Aluno][0];

				}else{
					maior = Planilha[Aluno][1];

				}
				Planilha[Aluno][3] = media(Planilha[Aluno][2], maior);


			}

		}
		System.out.println("\nNotas dos alunos:");
		for (int Aluno = 0; Aluno < 5; Aluno++) {
			System.out.printf("Aluno %d: ", Aluno + 1);
			for (int Nota = 0; Nota < 4; Nota++) {
				System.out.printf("%.1f ", Planilha[Aluno][Nota]);
			}
			if(Planilha[Aluno][3]>=5){
				System.out.printf(" Aluno Aprovado! \n");
			}else{
				System.out.printf(" Aluno reprovado! \n");
			}
		}

	}
}

