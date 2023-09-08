import React from 'react';
import "./Footer.css"

function Footer() {
  return (
    <footer className="bg-dark text-white text-center py-3">
      <div className="container">
        <p>&copy; {new Date().getFullYear()} By Eduardo M Moreno. Todos los derechos reservados.</p>
      </div>
    </footer>
  );
}
export default Footer;
