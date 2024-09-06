var Numero1 = Number(prompt("Insira o Primeiro Numero"));
var Numero2 = Number(prompt("Insira o Segundo Numero"));
var Maior;
var Menor;

if (Numero1 >= Numero2) {
    Maior = Numero1;
    Menor = Numero2;
} else {
    Maior = Numero2;
    Menor = Numero1;
}

var Numero3 = Number(prompt("Insira o numero de comparacao para saber se ele esta no intervalo"));

if (Numero3 > Menor && Numero3 < Maior) {
    console.log("O numero de comparacao esta no intervalo!");
} else {
    console.log("O numero de comparacao NAO esta no intervalo!");
}
