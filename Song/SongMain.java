import java.util.*;
import java.io.*;

public class SongMain {
    public static void main(String[] args ) throws FileNotFoundException {
        Scanner input = new Scanner( System.in );
        SongCollection song = new SongCollection();
        
        int action;

        do {
            System.out.println("========Select action========");
            System.out.println("0. Quit");
            System.out.println("1. Get collection size");
            System.out.println("2. Search for title");
            System.out.println("3. Search for artist");
            System.out.println("4. Add from file");
            System.out.println("5. Save to file");
            System.out.println("6. Add one song");
            System.out.println("7. Remove one song");
            System.out.println("8. Show");
            System.out.print("Enter choice: ");
            action = Integer.parseInt(input.nextLine());

            switch (action) {
                case 0: System.out.println("A quit command was entered");
                    break;
                case 1: int size = song.size();
                        System.out.println("*** \n " + "*** Size = " + size);
                    break;
                case 2: System.out.println("Enter title search key: ");
                        String key = input.nextLine();
                        song.searchByTitle(key);
                    break;
                case 3: System.out.print("Enter artist search key: ");
                        key = input.nextLine();
                        song.searchByArtist(key);
                    break;
                case 4: System.out.println("Enter file name: ");
                        String fileName = input.nextLine();
                        File f = new File(fileName);
                        song.addFromFile(f);
                    break;
                case 5: System.out.println("Enter file name: ");
                        fileName = input.nextLine();
                        f = new File(fileName);
                        song.writeToFile(f);
                    break;
                case 6: System.out.println("Enter title: ");
                        String t = input.nextLine();
                        System.out.println("Enter artist: ");
                        String a = input.nextLine();
                        song.addOneSong(t,a);
                    break;
                case 7: System.out.println("Enter position: ");
                        int pos = input.nextInt();
                        song.delete(pos);
                    break;
                case 8: System.out.println("Enter start position: ");
                        int start = Integer.parseInt(input.nextLine());
                        System.out.println("Enter end position: ");
                        int end = Integer.parseInt(input.nextLine());
                        song.show(start, end);
                    break;
                default: System.out.println("Invalid Input");
                    break;
            }
        } while (action != 0);
    }
}