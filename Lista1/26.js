var Numero = Number(prompt("Insira um numero para descobrir se ele e primo"));
var Divisores = 0;

for (var Divisor = 1; Divisor <= Numero; Divisor++) {
    if (Numero % Divisor == 0) {
        Divisores++;
    }
}

if (Divisores == 2) {
    console.log("O numero inserido e primo");
} else {
    console.log("O numero inserido nao e primo");
}
