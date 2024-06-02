package Herencia.MusicPlayer;

public class ITunes implements MusicPlayer, OfflineMusicPlayer{

    @Override
    public void load() {
        System.out.println("Loading music on iTunes");
    }

    @Override
    public void play() {

        System.out.println("Playing music on iTunes");

    }

    @Override
    public void stop() {
        System.out.println("Stopping music on iTunes");

    }
}
