import { useState, useEffect } from 'react';


export function PokemonxID({ pokemonId }) {
    const [pokemonData, setPokemonData] = useState(null);

    useEffect(() => {
        fetch(`https://pokeapi.co/api/v2/pokemon/${pokemonId}`)
            .then(response => response.json())
            .then(data => {
                setPokemonData(data);
            })
            .catch(error => {
                console.error('Error fetching data:', error);
            });
    }, [pokemonId]);

    if (!pokemonData) {
        return <div>Cargando...</div>;
    }

    return pokemonData
}