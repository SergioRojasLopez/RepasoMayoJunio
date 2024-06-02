package Herencia.Gamer;

public class Main {
    public static void main(String[] args) {
        EsportsTournament torneo = new EsportsTournament();
        Gamer [] players =  {new MOBAGamer(),new FPSGamer(),new SportsGamer()};
        torneo.startTournament(players);
    }
}
