

var valores = [true, 5, false, "hola", "adios", 2];

var texto1 = valores[3];
var texto2 = valores[4];

if (texto1.length > texto2.length) {
    console.log(texto1 + " es mayor que " + texto2);
} else if (texto2.length > texto1.length) {
    console.log(texto2 + " es mayor que " + texto1);
} else {
    console.log("Ambos textos tienen la misma longitud.");
}

var resultadoTrue = valores[0] || valores[2]; // true || false
var resultadoFalse = valores[0] && valores[2]; // true && false

console.log("Resultado True:", resultadoTrue);
console.log("Resultado False:", resultadoFalse);

var num1 = valores[1];
var num2 = valores[5];

var suma = num1 + num2;
var resta = num1 - num2;
var multiplicacion = num1 * num2;
var division = num1 / num2;
var modulo = num1 % num2;

console.log("Suma:", suma);
console.log("Resta:", resta);
console.log("Multiplicación:", multiplicacion);
console.log("División:", division);
console.log("Módulo:", modulo);