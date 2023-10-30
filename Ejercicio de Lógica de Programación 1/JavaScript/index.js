//Comparador y ordenar numeros:

const aNumber = Number(window.prompt("Escriba primer numero", ""));
console.log(`Primer numero es: ${aNumber}`);
const bNumber = Number(window.prompt("Escriba segundo numero", ""));
console.log(`Segundo numero es: ${bNumber}`);
const cNumber = Number(window.prompt("Escriba tercer numero", ""));
console.log(`Tercer Numero es: ${cNumber}`);

//Ciclo para encontrar numero maximo y min
if (aNumber === bNumber && aNumber === cNumber && bNumber=== cNumber){
    alert (`Los numeros ${aNumber},${bNumber},${cNumber} son iguales`);
} else{
    ordenamientoMayor = Math.max(aNumber,bNumber,cNumber);
    ordenamientoMenor = Math.min(aNumber,bNumber,cNumber);
}

//Ciclo para encontrar numero central 
if (aNumber !== ordenamientoMayor && aNumber !== ordenamientoMenor) {
    ordenamientoCentral= aNumber;
} else if (bNumber !== ordenamientoMayor && bNumber !== ordenamientoMenor) {
    ordenamientoCentral=bNumber;
}else{
    ordenamientoCentral=cNumber;
}

alert(`Los numeros ordenados son: ${ordenamientoMayor} ${ordenamientoCentral} ${ordenamientoMenor}`)