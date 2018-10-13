import java.util.*;
import java.lang.Math;

public class MathCalculation {
    public static void main(String[] args) {
        integralInteractive(a);
    }

    public static int integralInteractive(double _a, double _b, double _c, double _d, double _e) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int a = input.nextInt();
        a = Math.abs(a);

        return a;
    }
}