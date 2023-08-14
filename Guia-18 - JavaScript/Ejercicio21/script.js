document.addEventListener("DOMContentLoaded", function () {

  let arrayPersonas = [];
  
  document
    .getElementById("estadoForm")
    .addEventListener("submit", function (event) {
      event.preventDefault();

      const nombre = document.getElementById("nombre").value;
      const edad = document.getElementById("edad").value;
      const sexos = document.getElementById("sexo").value;
      const peso = document.getElementById("peso").value;
      const altura = document.getElementById("altura").value;

      console.log(nombre);
      console.log(edad);
      console.log(sexos);
      console.log(peso);
      console.log(altura);
      let sexo = "";
      if (sexo == 1) {
        sexo = "Hombre";
      } else if (sexo == 2) {
        sexo = " Mujer";
      } else {
        sexo = "Otro";
      }

      let persona = new Object();
      persona.nombre = nombre;
      persona.edad = edad;
      persona.sexo = sexo;
      persona.peso = peso;
      persona.altura = altura;

      arrayPersonas.push(persona);

      console.log(persona);
      console.log(arrayPersonas);
    });
});
