#include <stdio.h>
#include <string.h>
#include <stdlib.h>

/*19.Faça um programa que peça ao usuário um número entre 12 e 20. 
Se a pessoa digitar um número diferente, mostrar a mensagem "entrada inválida" e 
solicitar o número novamente. Se digitar correto mostrar o número digitado.*/

int main(){
    int Numero;
    while(1){
        printf("Insira um numero entre 12 e 20: \n");
        scanf("%d", &Numero);
        if (Numero > 12 && Numero < 20){
            printf("O numero digitado foi %d \n", Numero);
            break;
        }else{
            printf("entrada Invalida \n");
        }
    } 
}