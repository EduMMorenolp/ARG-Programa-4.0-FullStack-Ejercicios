import React, { useState, useEffect } from 'react';
import './PokemonCard.css';

function PokemonCard({ pokemonId, pokemonName }) {
    const [pokemonData, setPokemonData] = useState(null);

    useEffect(() => {
        if (pokemonId || pokemonName) {
            fetch(`https://pokeapi.co/api/v2/pokemon/${pokemonId || pokemonName}`)
                .then(response => response.json())
                .then(data => {
                    setPokemonData(data);
                })
                .catch(error => {
                    console.error('Error fetching data:', error);
                });
        }
    }, [pokemonId, pokemonName]);

    if (!pokemonData) {
        return <div>Cargando...</div>;
    }

    return (
        <div className={`pokemon-card ${pokemonData.types[0].type.name}`}>
            <img src={pokemonData.sprites.front_default} alt={`Imagen de ${pokemonData.name}`} />
            <h3>{pokemonData.name}</h3>
            <p><strong>Altura:</strong> {pokemonData.height * 10} cm</p>
            <p><strong>Peso:</strong> {pokemonData.weight / 10} kg</p>
            <ul>
                <li>
                    <strong>Vida:</strong> {pokemonData.stats[0].base_stat}
                </li>
                <li>
                    <strong>Ataque:</strong> {pokemonData.stats[1].base_stat}
                </li>
                <li>
                    <strong>Defensa:</strong> {pokemonData.stats[2].base_stat}
                </li>
                <li>
                    <strong>Ataque Especial:</strong> {pokemonData.stats[3].base_stat}
                </li>
                <li>
                    <strong>Defensa Especial:</strong> {pokemonData.stats[4].base_stat}
                </li>
                <li>
                    <strong>Velocidad:</strong> {pokemonData.stats[5].base_stat}
                </li>
                <li>
                    <strong>Tipo:</strong>
                    <span className={`pokemon-type ${pokemonData.types[0].type.name}`}>
                        {pokemonData.types.map(type => type.type.name).join(', ')}
                    </span>
                </li>
            </ul>
        </div>
    );
    /*
 
    */
}



export default PokemonCard;
