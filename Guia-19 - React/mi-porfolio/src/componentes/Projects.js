import React from 'react';

function Projects() {
  // Ejemplo de datos de proyectos
  const projects = [
    {
      id: 1,
      title: 'Portfolio 0.1 v',
      description: 'Descripción del proyecto 1.',
      link: 'https://www.ejemplolink1.com',
    },
    {
      id: 2,
      title: 'Aprender a Programar',
      description: 'Descripción del proyecto 2.',
      link: 'https://www.ejemplolink2.com',
    },
    {
      id: 3,
      title: 'Proyecto 3',
      description: 'Descripción del proyecto 2.',
      link: 'https://www.ejemplolink2.com',
    },
    {
      id: 4,
      title: 'Proyecto 4',
      description: 'Descripción del proyecto 2.',
      link: 'https://www.ejemplolink2.com',
    },
    // Agrega más proyectos según tus necesidades
  ];

  return (
    <section id="projects" className="container">
      <h2 className="display-4 text-center">Proyectos</h2>
      <div className="row">
        {projects.map((project) => (
          <div key={project.id} className="col-md-6">
            <div className="card mb-4">
              <div className="card-body">
                <h3 className="card-title">{project.title}</h3>
                <p className="card-text">{project.description}</p>
                <a href={project.link} className="btn btn-primary" target="_blank" rel="noopener noreferrer">
                  Ver proyecto
                </a>
              </div>
            </div>
          </div>
        ))}
      </div>
    </section>
  );
}

export default Projects;
