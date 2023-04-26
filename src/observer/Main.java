package observer;

public class Main {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        SongDisplay display = new SongDisplay();
        display.setCurrentSong("Lose Yourself");
        player.addObserver(display);
        player.addToPlaylist("Lose Yourself");
        player.addToPlaylist("Without Me");
        player.play();
    }
}
