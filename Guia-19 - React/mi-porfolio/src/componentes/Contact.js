import React from 'react';

function Contact() {
  return (
    <section id="contact" className="container text-center">
      <div id="contacto" className="tarjeta">
        <h2>Contacto</h2>
        <p><a href="mailto:e.m.morenolp@gmail.com">e.m.morenolp@gmail.com</a></p>
        <p>Curriculum Vitae: <a href="descargas/Curriculum%20Developer%202023.docx" download className="boton-descargar">Descargar CV</a></p>
        <p>Si deseas ponerte en contacto conmigo o tienes alguna consulta, no dudes en enviarme un mensaje. Estaré encantado de ayudarte.</p>
        <p>Puedes utilizar el formulario de contacto a continuación o escribirme directamente a mi dirección de correo electrónico.</p>
        <p>¡Espero tener noticias tuyas pronto!</p>
        <div className="social2-links">
          <ul className="sidebar2">
            <li><a href="https://www.linkedin.com/in/eduardo-m-moreno-programador/" target="_blank" rel="noopener noreferrer"><i className="fab fa-linkedin" style={{ color: '#0077B5' }}> LinkedIn</i></a></li>
            <li><a href="https://github.com/EduMMorenolp" target="_blank" rel="noopener noreferrer"><i className="fab fa-github"> GitHub</i></a></li>
            <li><a href="https://www.instagram.com/edu.m.morenolp/" target="_blank" rel="noopener noreferrer"><i className="fab fa-instagram" style={{ color: '#E4405F' }}> Instagram</i></a></li>
            <li><a href="https://twitter.com/EduMMorenolp" target="_blank" rel="noopener noreferrer"><i className="fab fa-twitter" style={{ color: '#1DA1F2' }}> Twitter</i></a></li>
            <li><a href="https://discord.gg/HPdMbjPx" target="_blank" rel="noopener noreferrer"><i className="fab fa-discord" style={{ color: '#7289DA' }}> Discord</i></a></li>
            <li><a href="https://www.youtube.com/@edummorenolp" target="_blank" rel="noopener noreferrer"><i className="fab fa-youtube" style={{ color: '#FF0000' }}> Youtube</i></a></li>
            <li><a href="https://www.twitch.tv/edummorenolp" target="_blank" rel="noopener noreferrer"><i className="fab fa-twitch" style={{ color: '#9146FF' }}> Twitch</i></a></li>
          </ul>
        </div>
      </div>
    </section>
  );
}

export default Contact;


