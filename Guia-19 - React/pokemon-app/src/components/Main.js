import React, { useState, useEffect } from 'react';
import './Main.css';
import PokemonCard from './PokemonCard';

function Main() {
    const [pokemonId, setPokemonId] = useState('');
    const [pokemonName, setPokemonName] = useState('');
    const [pokemonList, setPokemonList] = useState([]);
    const [currentPokemonIndex, setCurrentPokemonIndex] = useState(0);

    const handleIdChange = (e) => {
        setPokemonId(e.target.value);
    };

    const handleNameChange = (e) => {
        setPokemonName(e.target.value.toLowerCase());
    };

    useEffect(() => {
        fetch(`https://pokeapi.co/api/v2/pokemon/${pokemonId || pokemonName}`)
            .then((response) => response.json())
            .then((data) => {
                if (!Array.isArray(data)) {
                    setPokemonList([data]);
                }
            })
            .catch((error) => {
                console.error('Error fetching data:', error);
            });
    }, [pokemonId, pokemonName]);

    const handleNextPokemon = () => {
        setCurrentPokemonIndex((prevIndex) => {
            if (pokemonList.length === 0) {
                return prevIndex;
            }
            const newIndex = (prevIndex + 1) % pokemonList.length;
            console.log('Next Index:', newIndex);
            return newIndex;
        });
    };

    const handlePreviousPokemon = () => {
        setCurrentPokemonIndex((prevIndex) => {
            if (pokemonList.length === 1) {
                return prevIndex;
            }
            const newIndex = prevIndex === 0 ? pokemonList.length - 1 : prevIndex - 1;
            return newIndex;
        });
    };

    return (
        <div className="main-container">
            <h1>Pokémon-App</h1>
            <div className="search-container">
                <div className="search-by-id">
                    <input
                        type="text"
                        placeholder="Ingrese el ID"
                        value={pokemonId}
                        onChange={handleIdChange}
                    />
                </div>
                <div className="search-by-name">
                    <input
                        type="text"
                        placeholder="Ingrese el Nombre"
                        value={pokemonName}
                        onChange={handleNameChange}
                    />
                </div>
            </div>
            <div className="pokemon-carousel">
                {pokemonList.length > 0 && (
                    <button onClick={handlePreviousPokemon}>Anterior</button>
                )}
                {pokemonList.length > 0 && (
                    <PokemonCard
                        pokemonId={pokemonList[currentPokemonIndex].id}
                    />
                )}
                {pokemonList.length > 0 && (
                    <button onClick={handleNextPokemon}>Siguiente</button>
                )}
            </div>
        </div>
    );
}

export default Main;
