import './App.css';
import Navbar from './componentes/Navbar';
import Footer from './componentes/Footer';
import Projects from './componentes/Projects';
import Contact from './componentes/Contact';
import Main from './componentes/Main';
import 'bootstrap/dist/css/bootstrap.min.css';


function App() {
  return (
    <div className="App">
      <Navbar/>
      <Main></Main>
      <Projects></Projects>
      <Contact></Contact>
      <Footer/>
    </div>
  );
}

/*
Proyecto "Mi Portafolio"

Este proyecto es mi portafolio personal, creado con React, donde muestro mis habilidades, proyectos y experiencia en desarrollo web. Aquí podrás conocer más sobre mí y explorar algunos de los proyectos en los que he trabajado.

Características:
- Secciones de presentación, sobre mí, proyectos y contacto.
- Navegación fácil a través de las secciones con React Router.
- Estilo personalizado con CSS para una presentación atractiva.

¡Gracias por visitar mi portafolio!
By Eduardo Manuel Moreno
*/

export default App;
