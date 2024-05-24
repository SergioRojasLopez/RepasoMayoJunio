package Herencia.JuegoPokemon.Model;

import Herencia.JuegoPokemon.Enum.WeatherCondition;
import Herencia.JuegoPokemon.Exception.MuerteException;
import Herencia.JuegoPokemon.Exception.RoundStartException;
import Herencia.JuegoPokemon.Exception.ValorNoValidoException;
import Herencia.JuegoPokemon.Interfaces.Atacable;

public class PokemonElectrico extends Pokemon implements Atacable {

    private double bonificacionTormElectrica = 1;
    private int reduccionDanno;

    public PokemonElectrico(String nombre, int salud, int ataque, int defensa, int reduccionDanno) throws ValorNoValidoException {
        super(nombre, salud, ataque, defensa);
        this.reduccionDanno = reduccionDanno;
        this.bonificacionTormElectrica = 1;
    }

    public double getBonificacionTormElectrica() {
        return bonificacionTormElectrica;
    }

    public int getReduccionDanno() {
        return reduccionDanno;
    }

    @Override
    public void atacar(Atacable atacable, WeatherCondition weatherCondition) throws MuerteException {
        atacable.serAtacado(this,weatherCondition, (int) (getAtaque() * bonificacionTormElectrica));
    }

    @Override
    public void serAtacado(Pokemon pokemon, WeatherCondition weatherCondition, int ataque) throws MuerteException {
        if (weatherCondition == WeatherCondition.LLUVIA){
            ataque = ataque - ataque * reduccionDanno / 100;
        }
        setSalud(getSalud() - ataque);
    }
    @Override
    public void roundStart(WeatherCondition weatherCondition) throws RoundStartException {

        if (!estaVivo()) {
            return;
        }
        if (weatherCondition == WeatherCondition.TORMENTA_ELECTRICA) {
            this.bonificacionTormElectrica = this.bonificacionTormElectrica * Math.random();
            throw new RoundStartException(this.getNombre() + " tiene bonificacion de daño por tormenta eléctrica");
        } else if (weatherCondition == WeatherCondition.LLUVIA){
            this.bonificacionTormElectrica = 1;
            throw new RoundStartException(this.getNombre() + " tiene reducción de daño gracias a la lluvia");
        }else {
            this.bonificacionTormElectrica = 1;
        }
    }
}
