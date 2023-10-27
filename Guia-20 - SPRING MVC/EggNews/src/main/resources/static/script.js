// JavaScript para manejar la eliminación de noticias
document.getElementById("eliminarNoticia").addEventListener("click", function () {
    var noticiaId = document.getElementById("noticiaId").value;
    if (noticiaId) {
        if (confirm("¿Estás seguro de que deseas eliminar esta noticia?")) {
            // Realizar la solicitud de eliminación al servidor
            fetch("/eliminarNoticia/" + noticiaId, {
                method: "GET"
            })
                .then(function (response) {
                    if (response.status === 200) {
                        alert("Noticia eliminada exitosamente.");
                        // Redireccionar o realizar otras acciones después de la eliminación
                    } else {
                        alert("No se pudo eliminar la noticia. Verifica el ID de la noticia.");
                    }
                });
        }
    } else {
        alert("Debes ingresar un ID de noticia válido.");
    }
})