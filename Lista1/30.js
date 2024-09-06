var Idade;
var Contagem = 0;
var Soma = 0;
var Maior = 0;
var Menor = 2000;
var Media;

console.log("Para encerrar a leitura, Insira 0");

while (true) {
    Idade = Number(prompt("Insira a idade da " + (Contagem + 1) + " pessoa analisada:"));
    
    if (Idade === 0) {
        break;
    }
    
    Soma = Soma + Idade;

    if (Idade > Maior) {
        Maior = Idade;
    }
    
    if (Idade < Menor && Idade !== 0) {
        Menor = Idade;
    }
    
    Contagem++;
}

console.log(Contagem + " pessoas foram analisadas");
Media = Soma / Contagem;
console.log("A idade media do grupo e de " + Media.toFixed(2) + " anos");
console.log("A MAIOR idade e de " + Maior + " e a MENOR e de " + Menor);
