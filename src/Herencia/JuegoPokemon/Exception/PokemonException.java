package Herencia.JuegoPokemon.Exception;

public class PokemonException extends Exception{
    public PokemonException() {
    }

    public PokemonException(String message) {
        super(message);
    }

    public PokemonException(String message, Throwable cause) {
        super(message, cause);
    }

    public PokemonException(Throwable cause) {
        super(cause);
    }

    public PokemonException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
