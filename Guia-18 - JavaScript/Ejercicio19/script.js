/*
Realizar un programa en JavaScript donde se creen dos arreglos: el primero será un arreglo A 
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El 
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla. 
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números 
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor 
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado 
de 20
*/

let arregloA = [];
let arregloB = [];
function numeroAleatorio(min, max) {
  return Math.floor(Math.random() * (max - min + 1)) + min;
}
function llenarVectorA(cant) {
  for (let i = 0; i < cant; i++) {
    arregloA.push(numeroAleatorio(1, 99));
  }
}
function llenarVectorB(opc, cant) {
  if (opc == 1) {
    for (let i = 0; i < cant; i++) {
      arregloB.push(0.5);
    }
  }
  if (opc == 2) {
    for (let i = 0; i < cant; i++) {
      arregloB.push(arregloA[i]);
    }
  }
}
// Llamando la funcion de llenado
llenarVectorA(50);
// Mostrando por Consola
console.log("Arreglo A : " + arregloA);
console.log("Arreglo B : " + arregloB);
// Ordenando Arreglo
arregloA.sort((a, b) => a - b);
console.log("Arreglo A Ordenado : " + arregloA);
// Sumando los 10 primeros Numeros de ArregloA al ArregloB
llenarVectorB(2, 10);
console.log("Arreglo B + A : " + arregloB);
// Sumando los 0.5 al ArregloB
llenarVectorB(1, 10);
console.log("Arreglo B + 0.5 : " + arregloB);