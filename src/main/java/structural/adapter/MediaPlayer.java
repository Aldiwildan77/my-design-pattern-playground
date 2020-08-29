package structural.adapter;

public interface MediaPlayer {
    void play(String type, String pathFile);

    void pause();

    void resume();

    void stop();
}
