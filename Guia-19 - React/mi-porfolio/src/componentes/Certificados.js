import React from 'react';
import { Carousel } from 'react-bootstrap';
import './Certificados.css';

const Certificados = () => {
  const imagenes = [
    {
      src: "../imagenes/certificados/Backend 1_ Introducción a Java.jpeg",
      alt: "Backend 1_ Introducción a Java",
    },
    {
      src: "../imagenes/certificados/Backend 2_ Java Y Base de Datos.jpeg",
      alt: "Backend 2_ Java Y Base de Datos",
    },
    {
      src: "../imagenes/certificados/UniversidadHTML.jpg",
      alt: "Introducción a la Programación",
    },
    {
      src: "../imagenes/certificados/UniversidadCSS.jpg",
      alt: "UniversidadCSS",
    },
    {
      src: "../imagenes/certificados/UniversidadDeProgramacion_Python_Java_JavaScript.jpg",
      alt: "UniversidadDeProgramacion_Python_Java_JavaScript",
    },
    {
      src: "../imagenes/certificados/UniversidadHTML.jpg",
      alt: "UniversidadHTML",
    },
  ];

  return (
    <div id="educacion" className="tarjeta">
      <h3>Certificaciones</h3>
      <Carousel>
        {imagenes.map((imagen, index) => (
          <Carousel.Item key={index}>
            <img className="d-block w-100" src={imagen.src} alt={imagen.alt} />
          </Carousel.Item>
        ))}
      </Carousel>
    </div>
  );
}

export default Certificados;
