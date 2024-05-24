package Herencia.JuegoPokemon.Model;

import Herencia.JuegoPokemon.Enum.WeatherCondition;
import Herencia.JuegoPokemon.Exception.MuerteException;
import Herencia.JuegoPokemon.Exception.RoundStartException;
import Herencia.JuegoPokemon.Exception.ValorNoValidoException;
import Herencia.JuegoPokemon.Interfaces.Atacable;

public class PokemonTierra extends Pokemon implements Atacable {

    public PokemonTierra(String nombre, int salud, int ataque, int defensa) throws ValorNoValidoException {
        super(nombre, salud, ataque, defensa);
    }

    @Override
    public void atacar(Atacable atacable, WeatherCondition weatherCondition) throws MuerteException {

    }

    @Override
    public void roundStart(WeatherCondition weatherCondition) throws RoundStartException {

    }

    @Override
    public void serAtacado(Pokemon pokemon, WeatherCondition weatherCondition, int ataque) throws MuerteException {

    }
}
