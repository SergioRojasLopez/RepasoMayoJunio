package Herencia.JuegoPokemon.Model;

import Herencia.JuegoPokemon.Enum.WeatherCondition;
import Herencia.JuegoPokemon.Exception.MuerteException;
import Herencia.JuegoPokemon.Exception.RoundStartException;
import Herencia.JuegoPokemon.Exception.ValorNoValidoException;
import Herencia.JuegoPokemon.Interfaces.Atacable;

public class PokemonTierra extends Pokemon implements Atacable {

    private int resistenciaElectrica;
    private double bonificacionTormArena = 1;

    public PokemonTierra(String nombre, int salud, int ataque, int defensa, int resistenciaElectrica) throws ValorNoValidoException {
        super(nombre, salud, ataque, defensa);
        setResistenciaElectrica(resistenciaElectrica);
        this.bonificacionTormArena = 1;
    }

    public int getResistenciaElectrica() {
        return resistenciaElectrica;
    }

    public double getBonificacionTormArena() {
        return bonificacionTormArena;
    }

    public void setResistenciaElectrica(int resistenciaElectrica) throws ValorNoValidoException {
        if (resistenciaElectrica < 1 || resistenciaElectrica > 9) {
            throw new ValorNoValidoException("Valor no valido");
        }
        this.resistenciaElectrica = resistenciaElectrica;
    }

    @Override
    public void atacar(Atacable atacable, WeatherCondition weatherCondition) throws MuerteException {
        atacable.serAtacado(this,weatherCondition, (int) (getAtaque() * bonificacionTormArena));
    }

    @Override
    public void serAtacado(Pokemon pokemon, WeatherCondition weatherCondition, int ataque) throws MuerteException {

        if (pokemon instanceof PokemonElectrico) {
            ataque = ataque - resistenciaElectrica;
        }
        setSalud(getSalud() - ataque);
    }

    @Override
    public void roundStart(WeatherCondition weatherCondition) throws RoundStartException {
        if (weatherCondition == WeatherCondition.TORMENTA_ARENA) {
            this.bonificacionTormArena = this.bonificacionTormArena * Math.random();
            throw new RoundStartException(getNombre() + " tiene bonificacion de daño por tormenta arena");
        } else {
            this.bonificacionTormArena = 1;
        }
    }
}
