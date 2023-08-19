document.addEventListener("DOMContentLoaded", function () {
  document
    .getElementById("estadoForm")
    .addEventListener("submit", function (event) {
      event.preventDefault();

      const numCaracter = document.getElementById(`cantCaracter`).value;

      let parrafos = document.getElementById(`parrafo`);

      const words = parrafos.innerText.split(" ");

      const paragraphs = parrafos.querySelectorAll("p");
      paragraphs.forEach((p) => {
        const words = p.innerText.split(" ");
        for (let i = 0; i < words.length; i++) {
          if (words[i].length == numCaracter) {
            console.log(words[i]);
            words[i] = `<span class="resaltado">${words[i]}</span>`;
          }
        }
        p.innerHTML = words.join(" ");
      });
    });
});

document.addEventListener("DOMContentLoaded", function () {
  var boton = document.getElementById("buttun");
  var resultado = document.getElementById("resultado");
  boton.addEventListener("click", function () {
    var texto = document.getElementById("texto");
    var numCaracter = document.getElementById("cantCaracter").value;
    var textoModificado = resaltarTexto(texto.value, numCaracter);
    resultado.innerHTML = textoModificado;
  });
});

function resaltarTexto(palabra, numCaracter) {
  const words = palabra.split(" ");
  for (let i = 0; i < words.length; i++) {
    if (words[i].length === parseInt(numCaracter)) {
      words[i] = `<span class="resaltado">${words[i]}</span>`;
    }
  }
  return words.join(" ");
}
