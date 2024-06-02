package Herencia.Gamer;

public class EsportsTournament {
    public void startTournament (Gamer [] players){
        for (Gamer jugador : players){

            jugador.playGame();
        }

    }
}
