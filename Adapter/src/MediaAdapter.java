public class MediaAdapter implements MediaPlayer {
    private MediaPackage media;

    public MediaAdapter(MediaPackage media){
        this.media = media;
    }

    @Override
    public void play(String filename) {
        System.out.println("\n<--Using Media Adapter-->");
        media.playFile(filename);
    }
}
