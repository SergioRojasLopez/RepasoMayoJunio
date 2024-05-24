package Herencia.JuegoPokemon.Interfaces;

import Herencia.JuegoPokemon.Enum.WeatherCondition;
import Herencia.JuegoPokemon.Exception.MuerteException;
import Herencia.JuegoPokemon.Model.Pokemon;

public interface Atacable {

     void serAtacado(Pokemon pokemon, WeatherCondition weatherCondition,int ataque)throws MuerteException;

}
