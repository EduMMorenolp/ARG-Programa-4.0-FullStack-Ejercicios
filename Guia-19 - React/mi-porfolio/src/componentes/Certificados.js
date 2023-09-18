import React from 'react';
import { Carousel } from 'react-bootstrap';

const Certificados = () => {
  return (
    <div id="educacion" className="tarjeta">
      <h3>Título de Certificaciones</h3>
      <Carousel>
        <Carousel.Item>
          <img
            className="d-block w-100"
            src="../imagenes/certificados/Backend 1_ Introducción a Java.jpeg"
            alt="Backend 1_ Introducción a Java"
          />
        </Carousel.Item>
        <Carousel.Item>
          <img
            className="d-block w-100"
            src="./certificados/UniversidadHTML.jpg"
            alt="Introduccióasdqn a la Programación"
          />
        </Carousel.Item>
        <Carousel.Item>
          <img
            className="d-block w-100"
            src="../imagenes/certificados/UniversidadCSS.jpg"
            alt="UniversidadCSS"
          />
        </Carousel.Item>
        <Carousel.Item>
          <img
            className="d-block w-100"
            src="../imagenes/certificados/UniversidadDeProgramacion_Python_Java_JavaScript.jpg"
            alt="UniversidadDeProgramacion_Python_Java_JavaScript"
          />
        </Carousel.Item>
        <Carousel.Item>
          <img
            className="d-block w-100"
            src="../imagenes/certificados/UniversidadHTML.jpg"
            alt="UniversidadHTML"
          />
        </Carousel.Item>
      </Carousel>
    </div>
  );
}

export default Certificados;
