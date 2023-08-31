import React, { useState } from 'react';
import './BattleApp.css';
import PokemonCard from './PokemonCard';


function BattleApp() {

    const [Pokemon, setPokemon] = useState(PokemonCard(1));
    
    console.log(Pokemon);
    
};


export default BattleApp;

