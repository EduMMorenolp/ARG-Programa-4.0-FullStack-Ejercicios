import "./App.css";
import React from "react";
import { Ejemplo } from "./componentes/ejemplo";

/*
Crear un proyecto compuesto de un solo Functional Component. En dicho componente
mostrar al menos dos datos, como por ejemplo titulo y subtitulo.
El componente debe ser llamado desde App, a continuación, se propondrá la jerarquía
del árbol de componentes y de como es el llamado desde index.js
    • Index.js
        o App
          § Ejemplo
*/

function App() {

  return (
    <div className="App">
      <Ejemplo></Ejemplo>
    </div>
  );
}

export default App;
