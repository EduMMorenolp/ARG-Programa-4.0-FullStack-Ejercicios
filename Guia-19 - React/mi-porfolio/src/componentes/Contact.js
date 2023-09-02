import React from 'react';

function Contact() {
  return (
    <section id="contact" className="container text-center">
      <h2 className="display-4">Contacto</h2>
      <p className="lead">¡Puedes contactarme a través de los siguientes medios:</p>
      <ul className="list-unstyled">
        <li>Email: tuemail@example.com</li>
        <li>LinkedIn: <a href="https://www.linkedin.com/in/tunombre">Tu Perfil de LinkedIn</a></li>
        {/* Agrega más detalles de contacto según tus preferencias */}
      </ul>
    </section>
  );
}

export default Contact;

