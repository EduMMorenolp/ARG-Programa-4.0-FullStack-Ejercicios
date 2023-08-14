document.addEventListener("DOMContentLoaded", function () {
  document
    .getElementById("estadoForm")
    .addEventListener("submit", function (event) {
      event.preventDefault();

      const radio = document.getElementById(`radio`).value;

      const area = calcularAreaCirculo(radio);
      const perimetro = calcularPerimetroCirculo(radio);

      console.log(`Área del círculo: ${area.toFixed(2)}`);
      console.log(`Perímetro del círculo: ${perimetro.toFixed(2)}`);

      resultado.innerHTML += `
      <table class="table table-primary">
                  <tr class="align-content-center">
                      <td scope="row-4"> ${radio}</td>
                      <td scope="row-4"> ${area.toFixed(2)}</td>
                      <td scope="row-4"> ${perimetro.toFixed(2)}</td>
                  </tr>
              </tbody>
              </table>
      `;

      // Función para calcular el área de un círculo
      function calcularAreaCirculo(radio) {
        return Math.PI * radio * radio;
      }

      // Función para calcular el perímetro de un círculo
      function calcularPerimetroCirculo(radio) {
        return 2 * Math.PI * radio;
      }
    });
});
