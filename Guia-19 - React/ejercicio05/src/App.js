import React, { useState } from "react";
import "./App.css";


function App() {
  const [contador, setContador] = useState(0);
  const [mensaje, setMensaje] = useState("");

  const incrementarContador = () => {
    setContador(contador + 1);
    if (contador + 1 === 10) {
      setMensaje("No te emociones ...");
    } else {
      setMensaje("");
    }
  };

  const resetContador = () => {
    setContador(0);
    setMensaje("");
  };

  return (
    <div className="App">
      <h1>Contador de Clics</h1>
      <p>Has hecho clic {contador} veces</p>
      <p>{mensaje}</p>
      <button onClick={incrementarContador}>Incrementar</button>
      <br/>
      <button onClick={resetContador}>Resetear Contador</button>
    </div>
  );
}

export default App;
