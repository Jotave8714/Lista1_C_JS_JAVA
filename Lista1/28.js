var Numero;

while (true) {
    Numero = Number(prompt("Insira um numero entre 12 e 20:"));
    if (Numero > 12 && Numero < 20) {
        console.log("O numero digitado foi " + Numero);
        break;
    } else {
        console.log("entrada Invalida");
    }
}
