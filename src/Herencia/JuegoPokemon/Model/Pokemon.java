package Herencia.JuegoPokemon.Model;

import Herencia.JuegoPokemon.Enum.WeatherCondition;
import Herencia.JuegoPokemon.Exception.MuerteException;
import Herencia.JuegoPokemon.Exception.RoundStartException;
import Herencia.JuegoPokemon.Exception.ValorNoValidoException;
import Herencia.JuegoPokemon.Interfaces.Atacable;

public abstract class Pokemon {

    private String nombre;
    private final int SALUD_MIN = 0;
    private final int SALUD_MAX = 100;
    private final int ATAQUE_MAX = 15;
    private final int ATAQUE_MIN = 5;
    private final int DEFENSA_MIN = 5;
    private final int DEFENSA_MAX = 25;

    private int salud, ataque, defensa;

    public Pokemon(String nombre, int salud, int ataque, int defensa) throws ValorNoValidoException {
        this.nombre = nombre;
        setSalud(salud);
        setAtaque(ataque);
        setDefensa(defensa);
    }

    public String getNombre() {
        return nombre;
    }

    public int getSalud() {
        return salud;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setSalud(int salud) {
        if (salud < SALUD_MIN) {
            salud = SALUD_MIN;
        } else if (salud > SALUD_MAX) {
            salud = SALUD_MAX;
        }
        this.salud = salud;
    }

    public void setAtaque(int ataque) throws ValorNoValidoException {
        if (ataque < ATAQUE_MIN || ataque > ATAQUE_MAX) {
            throw new ValorNoValidoException("Valores invalidos");
        }
        this.ataque = ataque;
    }

    public void setDefensa(int defensa) throws ValorNoValidoException {
        if (defensa < DEFENSA_MIN || defensa > DEFENSA_MAX){
            throw new ValorNoValidoException("Valores invalidos");
        }
        this.defensa = defensa;
    }
    public abstract void atacar(Atacable atacable, WeatherCondition weatherCondition) throws MuerteException;

    public abstract void roundStart (WeatherCondition weatherCondition)throws RoundStartException;

    public boolean estaVivo (){
        return salud > 0;
    }
}
