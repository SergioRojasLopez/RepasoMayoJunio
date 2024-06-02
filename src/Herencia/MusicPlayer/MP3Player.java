package Herencia.MusicPlayer;

public class MP3Player implements MusicPlayer,OfflineMusicPlayer{
    @Override
    public void load() {

        System.out.println("Loading music on MP3 Player");

    }

    @Override
    public void play() {
        System.out.println("Playing music on MP3 Player");
    }

    @Override
    public void stop() {

        System.out.println("Stopping music on MP3 Player");

    }
}
