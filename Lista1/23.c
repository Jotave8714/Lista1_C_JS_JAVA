#include <stdio.h>
#include <string.h>
#include <stdlib.h>

/*Crie um programa que receba três valores (obrigatoriamente maiores que zero),
representando as medidas dos três lados de um triângulo. Elabore funções para:
a.
Determinar se eles lados formam um triangulo, sabendo que:
i.
O comprimento de cada lado de um triângulo é menor do que a soma dos outros dois lados.
b.
Determinar e mostrar o tipo de triangulo, caso as medidas formem um triangulo.
i.
Equilátero três lados iguais.
ii.
Isósceles dois lados iguais.
iii.
Escaleno três lados diferentes*/

int main(){

    int Lado[3];

    for (int lado = 0; lado < 3; lado++){
        printf("Insira o Lado %d \n", lado + 1);
        scanf("%d", &Lado[lado]);

        while (Lado[lado] == 0){
            printf("Valor invalido, insira o lado %d novamente\n", lado + 1);
            scanf("%d", &Lado[lado]);

        }

    }
    if(Lado[0] < Lado[1] + Lado[2] && Lado[1] < Lado[0] + Lado[2] && Lado[2] < Lado[0] + Lado[1]){
        printf("Os Valores formam um triangulo! \n");

        if (Lado[0] == Lado[1] && Lado[0] == Lado[2] ){
            printf("O triangulo e Equilatero! \n");

        }else if (Lado[0] == Lado[1] && Lado[0] != Lado[2] || Lado[0] == Lado[2] && Lado[0] != Lado[1] ||Lado[1] == Lado[2] && Lado[1] != Lado[0]){
            printf("O triangulo e Isoceles! \n"); 

        }else if (Lado[0] != Lado[1] && Lado[0] != Lado[2] && Lado[1] != Lado[2]){
            printf("O triangulo e Escaleno! \n"); 

        } 
        
       
    }else{
        printf("Os Valores nao formam um triangulo! \n"); 
    }
    
    
    
}