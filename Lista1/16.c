#include <stdio.h>
#include <string.h>
#include <stdlib.h>

//16. Escreva um programa que leia 10 números e:
// a. Escreva o menor valor lido e o maior valor lido
//b. Some-os.
//c. Imprima sua média

int main(){
    int Numero[10], Maior = 0, Menor = 2000000, Soma = 0, Media;
    for (int Contagem = 0; Contagem < 10; Contagem++){
        printf("Insira o valor do %d nmumero: \n", Contagem + 1);
        scanf("%d", &Numero[Contagem]);
        Soma = Soma + Numero[Contagem];
        if(Numero[Contagem] >= Maior){
            Maior = Numero[Contagem];

        }
        if(Numero[Contagem] <= Menor){
            Menor = Numero[Contagem];

        }
        printf("\n");
    }
    printf("\n O Menor número inserido foi: %d\n", Menor);
    printf("O Maior número inserido foi: %d\n", Maior);
    printf("A Soma dos números foi: %d\n", Soma);
    Media = Soma/10;
    printf("A Média dos números foi: %d\n", Media);
}

