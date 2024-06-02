package Herencia.MusicPlayer;

public class Main {
    public static void main(String[] args) {
        MusicPlayer [] players = {new Spotify(),new MP3Player(),new ITunes()};

        MusicApp app = new MusicApp();

        app.startMusic(players);
    }
}
