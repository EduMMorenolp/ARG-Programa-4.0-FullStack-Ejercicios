import React, { useState, useEffect } from "react";
import { fetchCharacters } from "../Servicios/rickAndMortyService";
import './listaDePersonajes.css';
import { Carousel, CarouselItem} from 'react-bootstrap';
import 'bootstrap/dist/css/bootstrap.min.css';

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
            <Carousel>
                {characters.map((character, index) => (
                    <CarouselItem key={index}>
                        <div className="personaje">
                            <h3>Nombre: {character.name}</h3>
                            <img src={character.image} alt="foto" />
                            <h2>Información</h2>
                            <h3>Estado: {character.status}</h3>
                            <h3>Especie: {character.species}</h3>
                            <h3>Género: {character.gender}</h3>
                            <h3>Aparición: {character.origin.name}</h3>
                            <h3>Origen: {character.location.name}</h3>
                        </div>
                    </CarouselItem>
                ))}
            </Carousel>
        </div>
    );
}

export default Lista;