import java.util.*;
public class Hash {
    public static void main(String[] args) {
        String[] test = {"one", "two", "three", "three"};

        List<String> list = Arrays.asList(test);

        //System.out.printf("%s", list); 
        //System.out.println();       

        Set<String> set = new HashSet<String>(list);

        //System.out.printf("%s %n", set);

        hashset();
        hashmap();
        hashtable();
    }

    public static void hashset() {
        HashSet<Integer> numbers = new HashSet<Integer>(); //ignores multiples
        numbers.add(1234);
        numbers.add(5678);
        numbers.add(1234);

        System.out.printf("%s %n", numbers);
    }

    public static void hashmap() {
        HashMap<String, Integer> learning = new HashMap<String, Integer>();
        learning.put("Beau", 12345);

        System.out.printf("%s %n", learning);
    }

    public static void hashtable() {
        Hashtable<String, Integer> numbers = new Hashtable<String, Integer>();

        numbers.put("Beau", 12345);
        numbers.put("Beau", 12345);

        System.out.printf("%s %n", numbers);
    }
}