public class mp4 implements MediaPackage {
    @Override
    public void playFile(String fileName) {
        System.out.println("Playing mp4 " + fileName);
    }
}
