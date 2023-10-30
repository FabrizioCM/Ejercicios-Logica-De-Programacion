//calcular factorial
const aNumber = Number(window.prompt("Escriba un número", ""));
alert(`Calcular factorial de: ${aNumber}`);

function calcularFactorial(aNumber) {
    if (aNumber === 0) {
        return 1; // El factorial de 0 es 1
    } else {
        return aNumber * calcularFactorial(aNumber - 1); //multiplico ejemplo: 4*3=12*2=24*1=24
    }
}

const resultadoFactorial = calcularFactorial(aNumber);
alert(`El factorial de ${aNumber} es: ${resultadoFactorial}`);