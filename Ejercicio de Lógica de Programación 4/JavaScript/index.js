const aNumber = Number(window.prompt("Escriba un número", ""));
const muestreoNum = document.getElementById('Fibonacci');
let numeroUno = 0;
let numeroDos = 1;
let numeroTres = numeroUno + numeroDos;
function fibonacciNumb(aNumber) {
  let fibSequence = [];
  for (let i = 0; i < aNumber; i++) {
    fibSequence.push(numeroUno);
    numeroUno = numeroDos;
    numeroDos = numeroTres;
  }
  muestreoNum.textContent = fibSequence.join(", ");
}

fibonacciNumb(aNumber);