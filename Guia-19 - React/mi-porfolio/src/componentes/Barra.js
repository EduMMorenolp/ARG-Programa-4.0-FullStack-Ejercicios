import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import './Barra.css';
import React, { useState, useEffect, Fragment } from 'react';

function Barra() {
    const [nombre] = useState("Eduardo.M.Moreno");
    const [currentIndex, setCurrentIndex] = useState(0);
    const duracionIntervalo = 500;

    useEffect(() => {
        const interval = setInterval(() => {
            if (currentIndex < nombre.length) {
                setCurrentIndex(currentIndex + 1);
            } else {
                setCurrentIndex(1);
            }
        }, duracionIntervalo);

        return () => clearInterval(interval);
    }, [currentIndex, nombre]);

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
                    <Nav className="me-auto center">
                        <Nav.Link href="#Inicio">Inicio</Nav.Link>
                        <Nav.Link href="#Habilidades">Habilidades</Nav.Link>
                        <Nav.Link href="#Proyectos">Proyectos</Nav.Link>
                        <Nav.Link href="#Certificados">Certificados</Nav.Link>
                        <Nav.Link href="#Contacto">Contacto</Nav.Link>
                    </Nav>
                </Navbar.Collapse>
                <div className="sidebar">
                    <ul>
                        <li>
                            <a href="https://www.linkedin.com/in/eduardo-m-moreno-programador/" rel="noreferrer">
                                <i className="fab fa-linkedin"></i>
                                <span className="social-name" style={{ color: '#0077B5' }}>LinkedIn</span>
                            </a>
                        </li>
                        <li>
                            <a href="https://github.com/EduMMorenolp" rel="noreferrer">
                                <i className="fab fa-github"></i>
                                <span className="social-name" style={{ color: '#211F1F' }}>GitHub</span>
                            </a>
                        </li>
                        <li>
                            <a href="https://www.instagram.com/edu.m.morenolp/" rel="noreferrer">
                                <i className="fab fa-instagram"></i>
                                <span className="social-name" style={{ color: '#E4405F' }}>Instagram</span>
                            </a>
                        </li>
                        <li>
                            <a href="https://twitter.com/EduMMorenolp" rel="noreferrer">
                                <i className="fab fa-twitter"></i>
                                <span className="social-name" style={{ color: '#1DA1F2' }}>Twitter</span>
                            </a>
                        </li>
                    </ul>
                </div>
            </Container>
        </Navbar>
    );
}



export default Barra;

