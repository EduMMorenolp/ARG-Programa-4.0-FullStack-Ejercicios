document.addEventListener("DOMContentLoaded", function () {
  document
    .getElementById("estadoForm")
    .addEventListener("submit", function (event) {
      event.preventDefault();

      const mensaje = document.getElementById("resultado");

      let Nombre = "Eduardo Manuel Moreno";

      setTimeout(function () {
        console.log("Uno");
        mensaje.innerHTML = " Hola ! ";
      }, 500);

      setTimeout(function () {
        console.log("Dos");
        mensaje.innerHTML += " soy : ";
      }, 1000);

      setTimeout(function () {
        console.log("Tres");
        mensaje.innerHTML += `<h1>${Nombre}</h1>`;
        // Agregandole Estilos al mensaje
        mensaje.classList.add("fade-in-out"); 
      },2000);
      setTimeout(function () {
        console.log("Cuatro");
        mensaje.innerHTML = ``;
        // Retirando Estilos al mensaje
        mensaje.classList.remove("fade-in-out");
      }, 3500);
    });
});
