import java.util.*;

public class TaxCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter houshold name: ");
        String household = input.nextLine();

        System.out.print("Enter houshold income: ");
        int income = input.nextInt();

        System.out.print("Enter number of people in the household: ");
        int houseMembers = input.nextInt();

        System.out.print("Enter educational expenses: ");
        int eduExpense = input.nextInt();

        System.out.print("Enter job-related expenses: ");
        int jobExpenses = input.nextInt();
        
        int houseDeduction = houseMembers * 3000;
        double eduDeduction = (double)eduExpense * .90;
        double jobDeduction = (double)jobExpenses * .80;
        double taxableIncome = income - (houseDeduction + eduDeduction + jobDeduction);
        double incomeTax = (double)taxableIncome * .20;

        System.out.println("Deduction A = " + (int)houseDeduction);
        System.out.println("Deduction B = " + (int)eduDeduction);
        System.out.println("Deduction C = " + (int)jobDeduction);
        System.out.println("Taxable income = " + (int)taxableIncome);
        System.out.println("For " + household + ", the tax = " + (int)incomeTax);

        input.close();
    }
}