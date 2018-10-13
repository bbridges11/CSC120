import java.util.Scanner;
import java.lang.Math;

public class QuadraticFull {
    public static void main(String[] args) {
        
    }

    public static void solve() {
        Scanner input = new Scanner(System.in);

        double, a, b, c, discriminant, denominator, left, right;

        System.out.print("Enter a, b, and c for a x^2 + b x + c: ");

        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        discriminant = (Math.pow(b, 2) - (4 * (a) * (c)));
        denominator = 2 * a;
        left = (b * -1);
        right = Math.sqrt(Math.abs(discriminant));

        if(a == 0) {
            System.out.println("Invalid because the coefficient a is 0.");
            return;
        } else if(a < 0{
            a = (a * -1);
            b = (b * -1);
            c = (c * -1);
        }
    }
}