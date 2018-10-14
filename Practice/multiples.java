import java.util.*;
import java.lang.Math;

public class multiples {
    public static void main(String[] args) {
        try {
            int sum = 0;
            for(int i = 0; i < 10; i++) {
                if(i % 3 == 0 || i % 5 == 0) {
                    sum += i;
                }
            }
            System.out.println(sum);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}