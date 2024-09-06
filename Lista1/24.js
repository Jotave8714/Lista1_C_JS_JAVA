var Numero1 = Number(prompt("Insira o Valor do Numero1"));
var Numero2 = Number(prompt("Insira o Valor do Numero2"));
var Numero3 = Number(prompt("Insira o Valor do Numero3"));

var Maior;
var Menor;

if (Numero1 > Numero2 && Numero1 > Numero3) {
    Maior = Numero1;
} else if (Numero2 > Numero1 && Numero2 > Numero3) {
    Maior = Numero2;
} else {
    Maior = Numero3;
}

if (Numero1 < Numero2 && Numero1 < Numero3) {
    Menor = Numero1;
} else if (Numero2 < Numero1 && Numero2 < Numero3) {
    Menor = Numero2;
} else {
    Menor = Numero3;
}

console.log("O Maior numero e: " + Maior);
console.log("O Menor numero e: " + Menor);
