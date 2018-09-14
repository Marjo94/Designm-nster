public class vlc implements MediaPackage {
    @Override
    public void playFile(String fileName) {
        System.out.println("Playing vlc " + fileName);
    }
}
