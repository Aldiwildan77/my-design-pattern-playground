package structural.adapter;

public class VlcPlayer implements AdvanceMediaPlayer {

    @Override
    public void playVlc(String pathFile) {
        System.out.println("Playing vlc with file name are " + pathFile);
    }

    @Override
    public void playMp4(String filePath) {
        // do nothing
    }
}
