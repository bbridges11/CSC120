import java.util.*;
import java.lang.Math;

public class Factoring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 2;
        
        while(num >= 2) {
            System.out.print("Enter a number >= 2: ");
            num = input.nextInt();
            if(num < 2) {
                break;
            } else {
                factor(num);
                prettyFactor(num);
            }
        }
    }

    public static String factor(int n) {
        long theQuotient, theDivisor;
        String output = "";
        String concat = "";
        theQuotient = n;
        theDivisor = 2;
        output = theQuotient + " = ";
        concat = theDivisor + " * ";
        while(theQuotient > 1) {
            while(theQuotient % theDivisor == 0) {
                theQuotient = theQuotient / theDivisor;
                concat = theDivisor + " * ";
                if(theQuotient == 1) {
                    output = output.concat(theDivisor + "");
                } else {
                    output = output.concat(concat + "");
                }
            }
            theDivisor++;
        }
        System.out.println(output);
        return output;
    }

    public static String prettyFactor(int n) {
        long theQuotient, theDivisor;
        String output = "";
        String concat = "";
        long prevDivisor = 0;
        int count = 0;
        theQuotient = n;
        theDivisor = 2;
        output = theQuotient + " = ";
        concat = theDivisor + " * ";
        while(theQuotient > 1) {
            while(theQuotient % theDivisor == 0) {
                count++;
                theQuotient = theQuotient / theDivisor;
                concat = theDivisor + "^" + count + " * ";

                if(prevDivisor != theDivisor && count >= 2) {
                    output = output.concat(concat + "");
                }
            }
            prevDivisor = theDivisor;
            theDivisor++;
            count = 0;
        }
        System.out.println(output);
        return output;
    }
}