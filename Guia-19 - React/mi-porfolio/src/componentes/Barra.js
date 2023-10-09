import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import './Barra.css';
import React, { useState, useEffect, Fragment } from 'react';
import textContent from '../textContent';


function Barra({ onSectionChange }) {
    const [nombre] = useState("Eduardo M Moreno");
    const [currentIndex, setCurrentIndex] = useState(0);
    const [languageContent, setLanguage] = useState(textContent['espanol']);
    const duracionIntervalo = 500;

    useEffect(() => {
        const interval = setInterval(() => {
            if (currentIndex < nombre.length) {
                setCurrentIndex(currentIndex + 1);
            } else {
                setCurrentIndex(nombre.length);
            }
        }, duracionIntervalo);

        return () => clearInterval(interval);
    }, [currentIndex, nombre]);

    const handleNavLinkClick = (sectionName) => {
        onSectionChange(sectionName);
    };

    const handleLanguageChange = () => {
        const newLanguage = languageContent === textContent['espanol'] ? textContent['english'] : textContent['espanol'];
        
        setLanguage(newLanguage);
        console.log("Cambiando Idioma a", newLanguage);
    };

    return (
        <Navbar expand="lg" className="bg-body">
            <Container>
                <Navbar.Brand href="#home">
                    <Fragment>
                        <div className="nombre-container">
                            <span className="nombre-estilo">
                                {nombre.slice(0, currentIndex)}
                            </span>
                        </div>
                    </Fragment>
                </Navbar.Brand>
                <Navbar.Toggle aria-controls="basic-navbar-nav" />
                <Navbar.Collapse id="basic-navbar-nav" className="custom-collapse">
                    <Nav.Link onClick={() => handleNavLinkClick("Inicio")}>
                        {languageContent.inicio}
                    </Nav.Link>
                    <Nav.Link onClick={() => handleNavLinkClick("Habilidades")}>
                        {languageContent.habilidades}
                    </Nav.Link>
                    <Nav.Link onClick={() => handleNavLinkClick("Proyectos")}>
                        {languageContent.proyectos}
                    </Nav.Link>
                    <Nav.Link onClick={() => handleNavLinkClick("Certificados")}>
                        {languageContent.certificados}
                    </Nav.Link>
                    <Nav.Link onClick={() => handleNavLinkClick("Contacto")}>
                        {languageContent.contacto}
                    </Nav.Link>
                </Navbar.Collapse>
                
                <div className="language-button">
                    <button onClick={handleLanguageChange}>
                        {languageContent === textContent['espanol'] ? 'In English' : 'En Español'}
                    </button>
                </div>
            </Container>
        </Navbar>
    );
}



export default Barra;

