var Numero = [];
var Maior = 0;
var Menor = 2000000;
var Soma = 0;
var Media;

for (var Contagem = 0; Contagem < 10; Contagem++) {
    Numero[Contagem] = Number(prompt("Insira o valor do " + (Contagem + 1) + " numero:"));
    Soma = Soma + Numero[Contagem];
    if (Numero[Contagem] >= Maior) {
        Maior = Numero[Contagem];
    }
    if (Numero[Contagem] <= Menor) {
        Menor = Numero[Contagem];
    }
    console.log(""); // Linha em branco pra separar as entradas
}

console.log("O Menor numero inserido foi: " + Menor);
console.log("O Maior numero inserido foi: " + Maior);
console.log("A Soma dos numeros foi: " + Soma);
Media = Soma / 10;
console.log("A Media dos numeros foi: " + Media);
