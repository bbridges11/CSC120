import java.util.*;

public class Song implements SongInt {
    public String artist, title;

    public Song(String title, String artist) {
        this.artist = artist;
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }
    public String getTitle() {
        return title;
    }
}