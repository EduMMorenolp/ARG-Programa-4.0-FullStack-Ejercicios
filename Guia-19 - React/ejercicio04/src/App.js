
import Footer from "./componentes/footer"
import Navbar from "./componentes/navbar";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import Main1 from "./componentes/main1";
import Main2 from "./componentes/main2";

function App() {
  return (
    /*
    Crear un proyecto compuesto por 4 componentes bajo la siguiente jerarquía. 
    • Index.js
      o App
        § Navbar
        § Main1 o Main2
        § Footer
    Al hacer click sobre las dos posibles opciones en el NavBar, se deberá cambiar entre 
    Main1 y Main2 dependiendo de la navegación. Para lograrlo se deberá instalar y usar 
    React Router Dom.
    40
    A continuación, se propone como será la jerarquía de los componentes
    En la siguiente imagen se vera como establecer la navegación. Se sugiere ver los videos 
    explicativos que encontrarán en el canal de Youtube de Egg
    */
    <div className="App">
      <div className="App">
        <Router>
          <Navbar />
          <Routes>
            <Route path="/main1" element={<Main1 />} />
            <Route path="/main2" element={<Main2 />} />
          </Routes>
          <Footer />
        </Router>
      </div>
    </div>
  );
}

export default App;
