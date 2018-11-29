import java.util.*;

public class Election {

    public static String[] names = new String[0];
    public static String[] newNames = new String[0];
    public static int[] counts = new int[0];
    public static int[] newCounts = new int[0];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;

        System.out.println("########################################### \n" +
        "# Enter the votes, one vote per line.     # \n" +
        "# End with either CTRL-D or an empty line.# \n" +
        "###########################################");


        while(input.hasNext()) {
            name = input.nextLine();

            if(name.equals("")) {
                    break;
            } else {
                int find = find(names, name);
                if(find >= 0) {
                        counts[find]++;
                } else {
                    names = addName(names, name);
                    counts = addNewCount(counts);
                }
            }
        }
        findWinner(names, counts);
    }

    public static int find(String[] names, String name) {
        for(int i = 0; i < names.length - 1; i++) {
            if(names[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public static String[] addName(String[] names, String name) {

        String[] newNames = Arrays.copyOf(names, names.length + 1);

        newNames[newNames.length - 1] = name;
        /*
        String[] newNames = new String[names.length + 1];


        for(int i = 0; i < names.length; i++) {
                newNames[i] = names[i];
        }
        */

        return newNames;
    }

    public static int[] addNewCount(int[] counts) {
        int[] newCounts = Arrays.copyOf(counts, counts.length + 1);

        newCounts[newCounts.length - 1] = 1;


        return newCounts;
    }

    public static void findWinner(String[] names, int[] counts) {
        int temp = 0, maxCount = 0;
        String theWinner = "";

        //System.out.println(newCounts);
        for(int i = 0; i < counts.length - 1; i++) {
            if(counts[i] > maxCount) {
                maxCount = counts[i];
                theWinner = names[i];
            }
        System.out.println(names[i] + " recieved " + counts[i] + " votes.");
        }

        System.out.println("--------");
        System.out.println("The winner is " + theWinner);
    }
}