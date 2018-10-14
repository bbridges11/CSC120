import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;


public class Problem1 {
    private static final String INPUT_FILE_NAME = "problem1.in.txt";
    static int count = 0;
    
    public static void main(String[] args) {
        try {
            // prepare to read the file
            File inFile = new File(INPUT_FILE_NAME);
            FileReader fr = new FileReader(inFile);
            BufferedReader br = new BufferedReader(fr);
            String inLine = null;

            // get the number of test cases
            int T = Integer.parseInt(br.readLine());

            //loop through test cases
            for(int i = 0; i < T; i++) {
                //read next line
                inLine = br.readLine();
                
            }
            br.close();
            fr.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}