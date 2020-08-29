package structural.adapter;

public class Mp4Player implements AdvanceMediaPlayer {

    @Override
    public void playVlc(String pathFile) {
        // do nothing
    }

    @Override
    public void playMp4(String pathFile) {
        System.out.println("Playing mp4 with file name are " + pathFile);
    }
}
