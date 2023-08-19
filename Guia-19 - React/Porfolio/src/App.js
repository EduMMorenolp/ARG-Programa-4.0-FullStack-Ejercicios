import './App.css';
import {Inicio, MyProgressBar} from './componentes/Inicio';

function App() {
  return (
    <div className="App">
      <p> Desde App</p>
      <Inicio></Inicio>
      <MyProgressBar></MyProgressBar>
      <MyProgressBar></MyProgressBar>
      <MyProgressBar></MyProgressBar>
    </div>
  );
}


export default App;
