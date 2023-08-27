import React from "react";
import ReactDOM from "react-dom/client";
import App from "./App";

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(
  /* Crear un proyecto compuesto por tres componentes bajo la misma jerarquía. Crear un Navbar, Main y Footer. 
    • Index.js
      o App
        § Navbar
        § Main
        § Footer
  */
  <React.StrictMode>
    <App />
  </React.StrictMode>
);
