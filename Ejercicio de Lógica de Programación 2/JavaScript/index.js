///Obtenemos los elementos
const convertBtn = document.getElementById('convert-btn');
const temperaturaCelsius = document.getElementById('temperature');
const temperaturaFarenheit = document.getElementById('convertFar');
const temperaturaKelvin = document.getElementById('convertKel');

convertBtn.addEventListener('click', function() {
    const celsius = parseFloat(temperaturaCelsius.value);
    let fahrenheit = (celsius * 9/5) + 32;
    let kelvin = celsius + 273.15;
    temperaturaFarenheit.textContent = `Resultado en Fahrenheit: ${fahrenheit.toFixed(2)} °F`;
    temperaturaKelvin.textContent = `Resultado en Kelvin: ${kelvin.toFixed(2)} °K`;
});

