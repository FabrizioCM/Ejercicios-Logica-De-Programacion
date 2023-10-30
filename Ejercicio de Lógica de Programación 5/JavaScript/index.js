const IngresaNumeroSecreto = Number(window.prompt("Escriba un número", ""));

let numero = [];
let numeroIngresado =  IngresaNumeroSecreto;

function obtenerNumeroRandom(max) {
    return Math.floor(Math.random() * max);
}
console.log(`Numero ingresado es: ${numeroIngresado}` )
const numeroRandom = obtenerNumeroRandom(100);
numero.push(numeroRandom);

if (IngresaNumeroSecreto === numero[0]) {
    console.log("¡Adivinaste el número secreto!");
} else {
    console.log("Lo siento, el número secreto era diferente.");
    console.log("Numero Secreto es: " + `${numero}`)
}

