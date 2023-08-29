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
Crear un proyecto compuesto de un solo componente y un servicio, quien deberá ser 
capaz de llamar desde el servicio, mediante la funcionalidad Fetch, a la API de Rick and 
Morty ( https://rickandmortyapi.com/api/character ) .
Una vez llamado los datos desde el servicio, hacer uso de useEffect en el componente 
creado, deberá mostrar una lista compuesta de los nombres de los 20 primeros 
personajes
*/

