const IngresaNumeroSecreto = Number(window.prompt("Escriba un número", ""));
//Añado array vacio
let numero = [];
let numeroIngresado =  IngresaNumeroSecreto;
//Funcion para obtener numero random mediante Random
function obtenerNumeroRandom(max) {
    return Math.floor(Math.random() * max);
}
//muestro el numero ingresado mediante el console log
console.log(`Numero ingresado es: ${numeroIngresado}` )
// 
const numeroRandom = obtenerNumeroRandom(100);
//almacenamos el numero random con un maximo de 100
numero.push(numeroRandom);

//Secuencia condicional para saber si el numero ingresado es igual al almacenado en numero
if (IngresaNumeroSecreto === numero[0]) {
    console.log("¡Adivinaste el número secreto!");
} else {
    console.log("Lo siento, el número secreto era diferente.");
    console.log("Numero Secreto es: " + `${numero}`)
}

