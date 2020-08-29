package structural.adapter;

public class MediaAdapter implements MediaPlayer {

    AdvanceMediaPlayer advanceMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("mp4")) {
            advanceMediaPlayer = new Mp4Player();
        } else if (audioType.equalsIgnoreCase("vlc")) {
            advanceMediaPlayer = new VlcPlayer();
        }
    }

    @Override
    public void play(String audioType, String pathFile) {
        if (audioType.equalsIgnoreCase("mp4")) {
            advanceMediaPlayer.playMp4(pathFile);
        } else if (audioType.equalsIgnoreCase("vlc")) {
            advanceMediaPlayer.playVlc(pathFile);
        }
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void stop() {

    }
}
