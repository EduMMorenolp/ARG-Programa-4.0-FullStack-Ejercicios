import React from 'react';
import './Skills.css';

function Skills() {
    return (
        <div id="habilidades" className="tarjeta">
            <h3>Habilidades</h3>
            <div className="columnas">
                <div className="ceddi">
                    <h3>Entorno de desarrollo integrado (IDE)</h3>
                    <ul>
                        <li><i className="fab fa-microsoft"></i> Vs code</li>
                        <li><i className="fab fa-java"></i> Netbeans</li>
                    </ul>
                </div>

                <div className="cl">
                    <h3>Lenguajes</h3>
                    <ul>
                        <li><i className="fab fa-java"></i> Java</li>
                        <li><i className="fab fa-python"></i> Python</li>
                        <li><i className="fab fa-html5"></i> HTML5</li>
                        <li><i className="fab fa-css3"></i> CSS</li>
                        <li><i className="fab fa-js"></i> JavaScript</li>
                        <li><i className="fab fa-js-square"></i> TypeScript</li>
                        <li><i className="fab fa-angular"></i> Angular</li>
                        <li><i className="fab fa-react"></i> React</li>
                    </ul>
                </div>

                <div className="ccdv">
                    <h3>Control de versiones</h3>
                    <ul>
                        <li><i className="fab fa-git"></i> Git</li>
                        <li><i className="fab fa-github"></i> GitHub</li>
                    </ul>
                </div>

                <div className="cde">
                    <h3>Diseño y edición</h3>
                    <ul>
                        <li><i className="fas fa-file-word"></i> Word</li>
                        <li><i className="fas fa-file-excel"></i> Excel</li>
                        <li><i className="fas fa-file-powerpoint"></i> PowerPoint</li>
                        <li><i className="fab fa-figma"></i> Figma</li>
                        <li><i className="fas fa-project-diagram"></i> UML (Unified Modeling Language)</li>
                    </ul>
                </div>



                <div className="chp">
                    <h3>Habilidades personales</h3>
                    <ul>
                        <li><i className="fas fa-comments"></i> Comunicación efectiva</li>
                        <li><i className="fas fa-users"></i> Trabajo en equipo</li>
                        <li><i className="fas fa-lightbulb"></i> Resolución de problemas</li>
                        <li><i className="fas fa-brain"></i> Pensamiento crítico</li>
                        <li><i className="fas fa-clock"></i> Gestión del tiempo</li>
                        <li><i className="fas fa-exchange-alt"></i> Adaptabilidad</li>
                        <li><i className="fas fa-graduation-cap"></i> Aprendizaje rápido</li>
                        <li><i className="fas fa-check"></i> Toma de decisiones</li>
                        <li><i className="fas fa-hands-helping"></i> Empatía</li>
                        <li><i className="fas fa-bolt"></i> Gestión del estrés</li>
                        <li><i className="fas fa-clipboard-check"></i> Autodisciplina</li>
                    </ul>
                </div>
                <div className="cbdd">
                    <h3>Base de datos</h3>
                    <ul>
                        <li><i className="fas fa-database"></i> MySQL Workbench</li>
                    </ul>
                </div>
            </div>
        </div>
    );
}

export default Skills;
