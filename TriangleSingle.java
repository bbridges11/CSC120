import java.util.*;

public class TriangleSingle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for( ; ; ) {
            System.out.print("Enter a number: ");
            int num = input.nextInt();

            if(num <= 0) {
                break;
            } 
            generate(num);
        }
    }
    public static void generate(int num) {

        int len, count;
        len = 1;
        count = 1;
        for(int i = 0; i <= num;) {
            System.out.print("*");
            count--;
            
            if(count == 0) {
                System.out.println();
                len++;
                i++;
                count = len;
                
            }
        }
    }
}