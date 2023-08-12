/*
    Crear un objeto libro que contenga las siguientes propiedades: ISBN, Título, Autor, 
    Número de páginas. Crear un método para cargar un libro pidiendo los datos al usuario 
    y luego informar mediante otro método el número de ISBN, el título, el autor del libro y el 
    numero de páginas.
*/

document.addEventListener("DOMContentLoaded", function () {
  document
    .getElementById("estadoForm")
    .addEventListener("submit", function (event) {
      event.preventDefault();
      const isbn = document.getElementById(`isbn`).value;
      const titulo = document.getElementById(`titulo`).value;
      const autor = document.getElementById(`autor`).value;
      const numPaginas = document.getElementById(`numPaginas`).value;

      libro.cargarLibro(isbn, titulo, autor, numPaginas);
      libro.mostrarInformacion();

      console.log(libro);

      resultado.innerHTML = `
            <table class="table table-primary">
                    <thead>
                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">ISBN</th>
                        <th scope="col">Titulo</th>
                        <th scope="col">Autor</th>
                        <th scope="col">NumPaginas</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <th scope="row">1</th>
                        <td> ${libro.ISBN}</td>
                        <td> ${libro.titulo}</td>
                        <td> ${libro.autor}</td>
                        <td> ${libro.numPaginas}</td>
                    </tr>
        `;
    });
});

const libro = {
  ISBN: "",
  titulo: "",
  autor: "",
  numPaginas: 0,
  cargarLibro: function (isbn, titulo, autor, numPaginas) {
    this.ISBN = isbn;
    this.titulo = titulo;
    this.autor = autor;
    this.numPaginas = numPaginas;
  },
  mostrarInformacion: function () {
    console.log(`ISBN: ${this.ISBN}`);
    console.log(`Título: ${this.titulo}`);
    console.log(`Autor: ${this.autor}`);
    console.log(`Número de páginas: ${this.numPaginas}`);
  },
};

// Usar los métodos del objeto libro*/
