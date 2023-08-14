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
