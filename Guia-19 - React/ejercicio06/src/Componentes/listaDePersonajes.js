import React, { useState, useEffect } from "react";
import { fetchCharacters } from "../Servicios/rickAndMortyService";

function Lista() {
    const [characters, setCharacters] = useState([]);

    useEffect(() => {
        async function fetchData() {
            const data = await fetchCharacters();
            setCharacters(data);
        }
        fetchData();
    }, []);

    return (
        <div className="App">
            <h1>Lista de Personajes de Rick and Morty</h1>
            <ul>
                {characters.map((character) => (
                    <li key={character.id}>{character.name}</li>
                ))}
            </ul>
        </div>
    );
}

export default Lista;