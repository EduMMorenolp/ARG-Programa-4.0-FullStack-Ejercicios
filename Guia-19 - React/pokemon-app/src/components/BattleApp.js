import React, { useState } from 'react';
import './BattleApp.css';
import PokemonLoader from './PokemonCard';
import PokemonUno from './PokemonUno';


function BattleApp() {
    const [pokemon1Id, setPokemon1Data] = useState(6);
    const [pokemon2Id, setPokemon2Data] = useState(3);
    const [turn, setTurn] = useState('jugador');

    const [vidaPokemon1, setVidaPokemon1] = useState(20);

    const reducirVidaPokemon1 = () => {
        console.log('Reducir Vida');
        setVidaPokemon1(vidaPokemon1 - 10);
        console.log(vidaPokemon1);
    };

    const handlePokemon1DataLoaded = data => {
        setPokemon1Data(data);
    };

    const handlePokemon2DataLoaded = data => {
        setPokemon2Data(data);
    };

    const handleAttack = () => {
        // Lógica para realizar un ataque
        if (turn === 'jugador') {
            reducirVidaPokemon1();
            // Realizar el ataque del jugador al oponente
            // Actualiza el estado del oponente
            // Cambiar el turno al oponente
            setTurn('oponente');
        } else {
            // Realizar el ataque del oponente al jugador
            // Actualizar la vida del jugador y otros datos
            // Cambiar el turno al jugador
            setTurn('jugador');
        }
    };

    const calculateDamage = (attacker, defender) => {
        // Lógica de cálculo de daño aquí
        // Puedes considerar estadísticas de ataque, defensa, tipo de ataque y tipo de defensor
        // Retornar el valor del daño calculado
        // Por ejemplo, podrías calcularlo como (Ataque del atacante - Defensa del defensor)
        const damage = attacker.attack - defender.defense;
        // Asegúrate de que el daño no sea negativo
        return Math.max(damage, 0);
    };

    return (
        <div className="battle-app">
            <div className="Pokemon1">
                {/* Cargar datos del primer Pokémon usando PokemonLoader */}
                <PokemonLoader pokemonId={pokemon1Id} onPokemonDataLoaded={handlePokemon1DataLoaded} />
            </div>
            <div className="ComandosBatalla">
                <h1>Turno de: {turn === 'jugador' ? 'Jugador' : 'Oponente'}</h1>
                <button onClick={handleAttack}>Usar Ataque</button>
            </div>
            <div className="Pokemon3">
                {/* Paso de la vida y la función de reducción a PokemonUno */}
                <PokemonUno pokemonId={pokemon2Id} vida={vidaPokemon1} reducirVida={reducirVidaPokemon1} />
            </div>
        </div>
    );
}

export default BattleApp;


