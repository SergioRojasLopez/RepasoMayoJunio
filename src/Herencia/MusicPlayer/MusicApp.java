package Herencia.MusicPlayer;

public class MusicApp {

    public void startMusic(MusicPlayer[] players) {

        for (MusicPlayer player : players) {
            if (player instanceof OnlineMusicPlayer) {
                ((OnlineMusicPlayer) player).stream();
            } else if (player instanceof OfflineMusicPlayer) {
                ((OfflineMusicPlayer) player).load();
            }
            player.play();
            player.stop();
        }
    }
}
