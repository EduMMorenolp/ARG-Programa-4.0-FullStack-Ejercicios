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