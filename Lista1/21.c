#include <stdio.h>
#include <string.h>
#include <stdlib.h>

/*21.
Faça um programa que, para um número indeterminado de pessoas: leia a idade de cada uma, sendo que a idade 0 (zero) indica o fim da leitura e não deve ser considerada. A seguir calcule:
a)
O número de pessoas;
b)
A idade média do grupo;
c)
Menor idade e a maior idade.*/

int main(){

    int Idade, Contagem = 0, Soma = 0, Maior = 0, Menor = 2000;
    double Media;
    printf("Para encerrar a leitura, Insira 0 \n");

    while (1){
        printf("Insira a idade da %d pessoa analizada: \n ", Contagem + 1);
        scanf("%d", &Idade);
        Soma = Soma + Idade;


        if (Idade > Maior) {
            Maior = Idade;
        }else{}

        if (Idade < Menor && Idade != 0){
            Menor = Idade;
        }else{}
        

        if(Idade == 0){
            break;
        }else{}

        Contagem++;
    }
    printf("%d pessoas foram analisadas\n", Contagem + 1);
    Media = (double)Soma / Contagem;
    printf("A idade media do grupo e de %.2f anos \n", Media);
    printf("A MAIOR idade e de %d e a MENOR e de %d \n", Maior, Menor);



    
}