const aNumber = Number(window.prompt("Escriba un número", ""));
const muestreoNum = document.getElementById('Fibonacci');
//Variables para 
let numeroUno = 0;
let numeroDos = 1;

function fibonacciNumb(aNumber) {
  //Array Vacio
  let fibSequence = [];
  //defino un ciclo con la variable i la cual iterara n veces el bucle 
  for (let i = 0; i < aNumber; i++) {
    //se agrega numero uno al arreglo
    fibSequence.push(numeroUno);
    //Calculo el siguiente valor ejemplo 0+1 = 1 // 1+1=2// 2+1 = 3// 3+2=5// etc
    const numeroTres = numeroUno + numeroDos;
    //actualizo las variables
    numeroUno = numeroDos;
    numeroDos = numeroTres;
  } 
  //Muestro el contenido en el DOM
  muestreoNum.textContent = fibSequence.join(", ");
}
//La llamo de nuevo utilizando 
fibonacciNumb(aNumber);