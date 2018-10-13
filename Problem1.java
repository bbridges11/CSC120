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
                int numOfBuses = Integer.parseInt(inLine);

                //read next line
                inLine = br.readLine();

                String[] tempList = inLine.split(" ");
                int[] tokens = new int[tempList.length];

                for(int x = 0; x < tempList.length; x++) {
                    tokens[x] = Integer.parseInt(tempList[x]);
                }

                inLine = br.readLine();
                int P = Integer.parseInt(inLine);
                System.out.println(P);

                inLine = br.readLine();
                int testCase = Integer.parseInt(inLine);
                int j;
                for(j = 0; j < tokens.length; j++) {
                    int pos = tokens[j*2];
                    int nextPos = tokens[j*2 + 1];

                    if(testCase >= pos && testCase <= nextPos) {
                        count++;
                    }
                }
                System.out.println(count);
                j = 0;
                count = 0;
            }
            br.close();
            fr.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}