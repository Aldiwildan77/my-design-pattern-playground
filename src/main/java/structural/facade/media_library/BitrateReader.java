package structural.facade.media_library;

public class BitrateReader {
    public static VideoFile read(VideoFile file, Codec codec){
        System.out.println("BitrateReader: reading file...");
        return file;
    }

    public static VideoFile extract(VideoFile buffer, Codec codec){
        System.out.println("BitrateReader: writing file...");
        return buffer;
    }
}
