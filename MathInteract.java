import java.util.*;

public class MathInteract {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2;
    
        System.out.print("Enter two real numbers : ");
        num1 = input.nextDouble();
        num2 = input.nextDouble();

        operate(num1, num2);

    }

    public static void operate(double num1, double num2) {
        Scanner input = new Scanner(System.in);
        String operator;

        String def = "notValid";
        
        System.out.print("Enter operation: ");
        operator = input.next();

        while(operator.length() == 1) {
            switch(operator) {
                case "+": System.out.printf("%.8f%n", num1 + num2); break;
                case "-": System.out.printf("%.8f%n", num1 - num2); break;
                case "/": System.out.printf("%.8f%n", num1 / num2); break;
                case "%": System.out.printf("%.8f%n", num1 % num2); break;
                case "*": System.out.printf("%.8f%n", num1 * num2); break;
            }
            System.out.print("Enter operation: ");
            operator = input.next();
        }
    }
}

/*

*/