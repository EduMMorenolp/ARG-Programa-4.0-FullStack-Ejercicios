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

      resultado.innerHTML = `
      <table class="table table-primary">
                    <thead>
                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">Radio</th>
                        <th scope="col">Area</th>
                        <th scope="col">Perimetro</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <th scope="row">1</th>
                        <td> ${radio}</td>
                        <td> ${area.toFixed(2)}</td>
                        <td> ${perimetro.toFixed(2)}</td>
                    </tr>
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
