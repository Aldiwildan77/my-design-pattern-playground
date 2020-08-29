package structural.adapter;

public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String pathFile) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 with file name are " + pathFile);
        } else if (audioType.equalsIgnoreCase("mp4") || audioType.equalsIgnoreCase("vlc")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, pathFile);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
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
