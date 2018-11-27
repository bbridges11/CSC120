import java.util.*;
import java.io.*;

public class SongCollection {
    private Song[] theSongs;

    public int size() {
        return theSongs.length;
    }

    public SongCollection() {
        theSongs = new Song[0];
    }

    public void addFromFile(File f) {
        try {
            Scanner scanner = new Scanner(f);
            int slots = Integer.parseInt(scanner.nextLine());
            int i = 0;
            Song[] merged = Arrays.copyOf(theSongs, theSongs.length + slots);

            while(scanner.hasNext()){
                String title = scanner.nextLine();

                String artist = scanner.nextLine();

                merged[i] = new Song(title, artist);
                i++;
            }
            theSongs = merged;
        } catch(FileNotFoundException e) {
            System.out.println("Error Occured");
            return;
        }
    }

    public void addOneSong(String t, String a) {
        Song newSong = new Song(t, a);
        Song[] merged = Arrays.copyOf(theSongs, theSongs.length + 1);
        merged[theSongs.length] = newSong;
        theSongs = merged;
    }

    public void writeToFile(File f) {
        try {
            PrintStream stream = new PrintStream(f);
            Scanner input = new Scanner(System.in);

            for(int i = 0;i < theSongs.length; i++) {
                stream.println(theSongs[i].getTitle());
                stream.println(theSongs[i].getArtist());
            }
        } catch(FileNotFoundException e) {
            System.out.println("Error Occured");
            return;
        }
    }

    public void delete(int pos) {
        int x = 0;
        Song[] merged = new Song[theSongs.length - 1];
        for(int i = 0; i < theSongs.length; i++) {
            if(i != pos) {
                merged[x] = theSongs[i];
                x++;
            }
        }
    }

    public void searchByTitle(String key) {
        for(int i = 0; i < theSongs.length; i++) {
            if(theSongs[i].getTitle().contains(key)) {
                System.out.println(i + ": " + theSongs[i].getTitle() + ", " + theSongs[i].getArtist());
            }
        }
    }

    public void searchByArtist(String key) {
        for(int i = 0; i < theSongs.length; i++) {
            if(theSongs[i].artist.contains(key)) {
                System.out.println(i + ": " + theSongs[i].getTitle() + ", " + theSongs[i].getArtist());
            }
        }
    }

    public void show(int start, int end) {
        if(start >= 0 && end < theSongs.length) {
            for(int i = start; i < end; i++) {
                System.out.println(i + ": " + theSongs[i].getTitle() + ", " + theSongs[i].getArtist());
            }
        }
    }
}
                    