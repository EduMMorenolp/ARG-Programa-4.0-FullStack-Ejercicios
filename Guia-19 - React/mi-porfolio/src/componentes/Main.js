import React from 'react';
import './Main.css';

function Main() {
  return (
    <section id="main" className="container text-center">
      <h1 className="display-4">Bienvenido a mi portafolio</h1>
      <p className="lead">¡Explora mis proyectos y conoce más sobre mí! en Contacto</p>
        <div id="sobre-mi" className="tarjeta">
          <h3>Sobre mí</h3>
          <img src="/imagenes/fotoEduMMoreno.png" alt="Foto de Eduardo Manuel Moreno"/>
          <hr></hr>
          <p>
            Soy un programador iniciado con una pasión por la tecnología y la resolución de problemas.
            En busca de oportunidades y proyectos emocionantes.
          </p>
        </div>
    </section>
  );
}

export default Main;
