var Escala = [];
var Temperatura;

Escala[0] = Number(prompt("Informe a sua Escala de Temperatura atual: (1- Fahrenheit, 2- Celsius, 3- Kelvin)"));
Temperatura = Number(prompt("Informe a Temperatura"));

switch (Escala[0]) {
    case 1:
        Escala[1] = Number(prompt("Informe a Escala para conversao: (1- Celsius, 2- Kelvin)"));
        switch (Escala[1]) {
            case 1:
                Temperatura = (Temperatura - 32) / 1.8; // F -> C
                break;
            case 2:
                Temperatura = ((Temperatura - 32) / 1.8) + 273.15; // F -> C -> K
                break;
            default:
                console.log("Opcao invalida");
                break;
        }
        break;

    case 2:
        Escala[1] = Number(prompt("Informe a Escala para conversao: (1- Fahrenheit, 2- Kelvin)"));
        switch (Escala[1]) {
            case 1:
                Temperatura = (Temperatura * 1.8) + 32; // C -> F
                break;
            case 2:
                Temperatura = Temperatura + 273.15; // C -> K
                break;
            default:
                console.log("Opcao invalida");
                break;
        }
        break;

    case 3:
        Escala[1] = Number(prompt("Informe a Escala para conversao: (1- Fahrenheit, 2- Celsius)"));
        switch (Escala[1]) {
            case 1:
                Temperatura = (1.8 * (Temperatura - 273)) + 32; // K -> F
                break;
            case 2:
                Temperatura = Temperatura - 273.15; // K -> C
                break;
            default:
                console.log("Opcao invalida");
                break;
        }
        break;

    default:
        console.log("Opcao invalida");
        break;
}

console.log("A temperatura convertida e " + Temperatura.toFixed(2));
