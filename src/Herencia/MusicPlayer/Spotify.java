package Herencia.MusicPlayer;

public class Spotify implements MusicPlayer,OnlineMusicPlayer{
    @Override
    public void stream() {

        System.out.println("Streaming music on spotify");
    }
    @Override
    public void play() {

        System.out.println("Playing music on spotify");

    }

    @Override
    public void stop() {
        System.out.println("Stopping music on spotify");

    }
}
