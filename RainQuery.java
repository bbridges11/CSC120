import java.io.*;
import java.util.*;

public class RainQuery {
    public static final String FILENAME = "precipitation.txt";
    public static final int FIRST_YEAR = 1931;
    public static final int LAST_YEAR = 2013;
    public static final int YEAR_SIZE = 12 * 31;
    public static final int N_YEARS = LAST_YEAR - FIRST_YEAR + 1;
    public static final int FULL_SIZE = N_YEARS * YEAR_SIZE;

    public static double[] readData() {
        File myFile;
        double[] data = new double[FILENAME.length];
        myFile = new File(FILENAME);

        for(double i: myFile) {
        }
    }
}