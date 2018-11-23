import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        System.out.println(test());
    }
    public static boolean test() {
        Integer[] numbers = {10, 15, 3, 7};
        int numNeeded, k = 17;
        List<Integer> list = Arrays.asList(numbers);
        for(int i: list) {
            numNeeded = k - i;
            if(list.contains(numNeeded)) {
                return true;
            }
        }
        return false;
    }

}