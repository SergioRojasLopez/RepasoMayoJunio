package Herencia.JuegoPokemon.Model;

import Herencia.JuegoPokemon.Enum.WeatherCondition;
import Herencia.JuegoPokemon.Exception.MuerteException;
import Herencia.JuegoPokemon.Exception.RoundStartException;
import Herencia.JuegoPokemon.Exception.ValorNoValidoException;
import Herencia.JuegoPokemon.Interfaces.Atacable;

public class PokemonFuego extends Pokemon implements Atacable {

    private int resistenciaAgua;
    private double bonificacionSol = 1;

    public PokemonFuego(String nombre, int salud, int ataque, int defensa, int resistenciaAgua) throws ValorNoValidoException {
        super(nombre, salud, ataque, defensa);
        setResistenciaAgua(resistenciaAgua);
    }

    public int getResistenciaAgua() {
        return resistenciaAgua;
    }

    public void setResistenciaAgua(int resistenciaAgua) throws ValorNoValidoException {
        if (resistenciaAgua < 5 || resistenciaAgua > 10) {
            throw new ValorNoValidoException("Valores no validos");
        }
        this.resistenciaAgua = resistenciaAgua;

    }

    @Override
    public void atacar(Atacable atacable, WeatherCondition weatherCondition) throws MuerteException {
        atacable.serAtacado(this, weatherCondition, (int) (getAtaque() * bonificacionSol));

    }

    @Override
    public void serAtacado(Pokemon pokemon, WeatherCondition weatherCondition, int ataque) throws MuerteException {
        if (pokemon instanceof PokemonAgua) {
            ataque = ataque - resistenciaAgua;
        }
        setSalud(getSalud() - ataque);
    }

    @Override
    public void roundStart(WeatherCondition weatherCondition) throws RoundStartException {

        if (!estaVivo()) {
            return;
        }
        this.bonificacionSol = 1;
        if (weatherCondition == WeatherCondition.DIA_SOLEADO) {
            this.bonificacionSol = this.bonificacionSol + Math.random();
            throw new RoundStartException(getNombre() + " tiene bonificacion de daño gracias a dia soleado");
        }
    }
}
