package Herencia.JuegoPokemon.Model;

import Herencia.JuegoPokemon.Enum.WeatherCondition;
import Herencia.JuegoPokemon.Exception.MuerteException;
import Herencia.JuegoPokemon.Exception.RoundStartException;
import Herencia.JuegoPokemon.Exception.ValorNoValidoException;
import Herencia.JuegoPokemon.Interfaces.Atacable;

public class PokemonAgua extends Pokemon implements Atacable {

    private int valorHidratacion;
    private double precisionLluvia;

    public PokemonAgua(String nombre, int salud, int ataque, int defensa, int valorHidratacion) throws ValorNoValidoException {
        super(nombre, salud, ataque, defensa);
        setValorHidratacion(valorHidratacion);
        this.precisionLluvia = 1;
    }

    public void setValorHidratacion(int valorHidratacion) throws ValorNoValidoException {
        if (valorHidratacion < 10 || valorHidratacion > 20) {
            throw new ValorNoValidoException("Valor invalido");
        }
        this.valorHidratacion = valorHidratacion;
    }

    public int getValorHidratacion() {
        return valorHidratacion;
    }

    public double getPrecisionLluvia() {
        return precisionLluvia;
    }

    public void serAtacado(Pokemon pokemon, WeatherCondition weatherCondition) throws MuerteException {


    }

    @Override
    public void atacar(Atacable atacable, WeatherCondition weatherCondition, int ataque) throws MuerteException {
        atacable.serAtacado(this,weatherCondition,(int)(getAtaque() * precisionLluvia));

    }

    @Override
    public void roundStart(WeatherCondition weatherCondition) throws RoundStartException {

        if (!estaVivo()) {
            return;
        }
        if (weatherCondition == WeatherCondition.LLUVIA){
            this.setSalud(this.getSalud() + getValorHidratacion());
            this.precisionLluvia = this.precisionLluvia + Math.random();
        }
        else {
            this.precisionLluvia = 1;
        }
    }

}
