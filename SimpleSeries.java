import java.util.*;

public class SimpleSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter begin and end: ");
        int begin = input.nextInt();
        int end = input.nextInt();

        counter(begin, end);
    }

    public static void counter(int begin, int end) {
        if(begin < end) {
            for(int i = begin; i <= end; i++) {
                System.out.println(begin);
                begin--;
            }
        } else if(begin > end) {
            for(int i = begin; i >= end; i--) {
                System.out.println(begin);
                begin++;
            }
        } else {
            System.out.println(begin);
        }
    }
}