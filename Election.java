import java.util.*;

public class Election {
    public static String[] names;
    public static int[] counts;
    public static String[] newNames;
    public static int[] newCounts;

    public static void main(String[] args) {
        
        System.out.println("########################################### \n" +
        "# Enter the votes, one vote per line. # \n" +
        "# End with either CTRL-D or an empty line.# \n" +
        "###########################################");
                Scanner input = new Scanner(System.in);
        String name;
        while(input.hasNext()) {
            int i=0;
            name = input.nextLine();
            i++;
            names = new String[ i ];
            counts = new int[ i ];
            if(name == "") {
                break;
            } else {
                find(names, name);
            }
        }
        findWinner(newNames, newCounts);
    }
    public static int find( String[] names, String name ) {
        for(int i = 0; i < names.length - 1; i++) {
            if(names[i] == name) {
                counts[i]++;
                return i;
            }
            else{
                addName(names, name);
                addNewCount(counts);
            }
        }    
        return -1;
    } 
    public static String[] addName( String[] names, String name ) {
        int x = name.length() + 1;
        newNames = new String[x];
        for(int i = 0; i <= x- 1; i++){
            newNames[i] = names[i];
        }
        newNames[x] = name;
        return newNames;
    }
    
    public static int[] addNewCount( int[] counts ) {
        newCounts = counts;
        newCounts[0] = 1;
        return newCounts;
    }
    
    public static void findWinner(String[] names, int[] newcounts ) {
        int maxCount = 0;
        String theWinner;
        int i;
        for(i = 0; i < newcounts.length; i++) {
            if(newCounts[i] > maxCount) {
            maxCount = newcounts[i];
            theWinner = newNames[i];
            }
        }
        System.out.println( newNames[i] + " received " + newCounts[i] + " votes.");
        System.out.println("--------");
    }    
}