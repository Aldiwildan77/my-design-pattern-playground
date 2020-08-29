package structural.adapter;

public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "/music/michael-jackson-heal-the-world");
        audioPlayer.play("vlc", "/music/jurassic-world");
        audioPlayer.play("mp4", "/music/indiana-john");
        audioPlayer.play("png", "/music/harvest-moon");
    }
}
