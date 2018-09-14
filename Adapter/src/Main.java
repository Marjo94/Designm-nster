public class Main {

    public static void main(String[] args){
        MediaPlayer player = new mp3();
        player.play("Zlatanslåt.mp3");

        player = new MediaAdapter(new mp4());
        player.play("Zlatanslåt.mp4");

        player = new MediaAdapter(new vlc());
        player.play("Zlatansfilm.vlc");


    }

}
