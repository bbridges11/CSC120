import java.util.*;

public class Hash {
    public static void main(String[] args) {
        String[] test = {"one", "two", "three", "three"};

        List<String> list = Arrays.asList(test);

        System.out.printf("%s", list); 
        System.out.println();       

        Set<String> set = new HashSet<String>(list);

        System.out.printf("%s %n", set);
    }
}