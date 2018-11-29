import java.util.*;

public class DuplicateCheck {
    public static int[] arr = new int[0];

    public static void main(String[] args) {
       System.out.println(duplicateCheck(arr)); 
       System.out.println(duplicateCheck1(arr)); 
       System.out.println(duplicateCheck2(arr)); 
    }

    public static boolean duplicateCheck(int[] arr) {//best time and space efficent method O of N time complexity
        HashSet<Integer> check = new HashSet<Integer>();

        for(int i: arr) {
            if(check.contains(i)) {
                return true;
            }
            check.add(i);
        }
        return false;
    }

    public static boolean duplicateCheck1(int[] arr) {//by sorting array the time complexity increased by copying the array the space complexity increased
        int[] newArr = Arrays.copyOf(arr, arr.length);

        Arrays.sort(newArr);

        for(int i = 0; i < newArr.length - 1; i++) {
            if(newArr[i] == newArr[i + 1]) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean duplicateCheck2(int[] arr) {//least efficent with a O of N squared time complexity
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 1; j < arr.length - 1; j++) {
                if(i != j && arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}