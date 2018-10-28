import java.util.*;
import java.lang.Math;

public class Birthday {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nPeople, nReps;
        double output;

        System.out.print("Enter the no. of people: ");
        nPeople = input.nextInt();
        System.out.print("Enter the no. of repetitions: ");
        nReps = input.nextInt();

        output = experiment1(nPeople, nReps);
        System.out.printf("\nProbability of Hits: " + "%.3f %n", output);
    }

    public static int[] oneTrial(int nPeople) {
        int [] theCounts = new int [365];
        int random;

        for(int i = 0; i < nPeople; i++) {
           random = (int)(Math.random() * theCounts.length);
           theCounts[random]++;
        }
        return theCounts;
    }

    public static boolean hasAHit(int[] oneTrial) {
        for(int i = 0; i < oneTrial.length; i++) {
            if(oneTrial[i] >= 2) {
                System.out.println(oneTrial[i]);
                return true;
            }
        }
        return false;
    }

    public static double experiment1(int nPeople, int nReps) {
        double hitRate = 0;
        boolean hasAHitReturn;
        for(int i = 0; i < nReps; i++) {
            oneTrial(nPeople);
            hasAHitReturn = hasAHit(oneTrial(nPeople));

            if(hasAHitReturn == true) {
                hitRate++;
            }
        }
        hitRate = hitRate / nReps;

        return hitRate;
    }

    public static double experiment2(int nPeople, int nReps) {
        double hitRate = 0;
        boolean hasAHitReturn;
        for(int i = 0; i < nReps; i++) {
            oneTrial(nPeople);
            hasAHitReturn = hasAHit(oneTrial(nPeople));

            if(hasAHitReturn == true) {
                hitRate++;
            }
        }
        hitRate = hitRate / nReps;

        return hitRate;
    }
}