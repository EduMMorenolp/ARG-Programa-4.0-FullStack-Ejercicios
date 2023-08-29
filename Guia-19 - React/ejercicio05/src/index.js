import React from 'react';
import ReactDOM from 'react-dom/client';
import App from './App';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>
);

/*
Crear un proyecto compuesto de un solo componente y hacer uso de useState y mostrar 
el state del componente. 
Se podrá crear un contador de clicks o crear un input que mediante onChange cambie 
el valor del state. Cualquiera de las dos opciones, son validas para este ejercicio. 
*/