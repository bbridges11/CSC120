import java.util.*;

public class LinEq {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter coefficients for the first equation: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        System.out.print("Enter coefficients for the second equation: ");
        int d = input.nextInt();
        int e = input.nextInt();
        int f = input.nextInt();

        System.out.println( lineCalc(a, b, c, d, e, f));

        input.close();
    }

    public static String lineCalc(int a, int b, int c, int d, int e, int f) {
        
    }
}