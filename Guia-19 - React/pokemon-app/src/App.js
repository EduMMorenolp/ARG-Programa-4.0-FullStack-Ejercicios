import PokemonCard from './components/PokemonCard';
import BattleApp from './components/BattleApp';

function App() {
  return (
    <div>
      <PokemonCard pokemonId={100} />
      <PokemonCard pokemonId={22} />
      <BattleApp></BattleApp>
    </div>
  );
}

export default App;
