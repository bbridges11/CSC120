import java.util.*;
import java.lang.Math;

public class TreasureHunting {

    static int prevX, prevY, nowX, nowY, trueX, trueY;

    public static void main(String[] args) {
        System.out.println("#######################################################");
        System.out.println("# A treasure has been hidden at a location in a 10x10 #");
        System.out.println("# gird. Guess where it is. You have 10 chances.       #");
        System.out.println("#######################################################");
         
        hunt();
    }

    public static void hunt() {
        Scanner input = new Scanner(System.in);
        nowX = -1;
        nowY = -1;
        int range = 11;
        trueX = (int)(Math.random() * range);
        trueY = (int)(Math.random() * range);

        for(int i = 1; i <= 10; i++) {
            if(nowX != trueX || nowY != trueY) {
                System.out.println("---- Round " + i + " ----");
                System.out.print("Enter your guess for X, Y: ");

                nowX = trueX;
                nowY = trueY;

                nowX = input.nextInt();
                nowY = input.nextInt();
                checkDistance();

                if(i >= 2) {
                    show();
                }

                if(i >= 2 && nowX != trueX || nowY != trueY) {
                    advise();
                }
                if()
            }
        }
        System.out.print("The treasure was at " + "(" + trueX + "," + trueY +")");
    }

    public static void show() {
        for(int y = 10; y >= 1; y--) {
            for(int x = 1; x <= 10; x++) {
                if(x == nowX && y == nowY) {
                    System.out.print("@");
                } else if(x == prevX && y == prevY) {
                    System.out.print("P");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println(" " + y);
        }
        System.out.println("@ = current, P = previous");
    }

    public static void checkDistance() {
        final int CLOSE = 3;
        final int FAR = 6;
        int distance;

        distance = Math.abs((nowX - nowY) + (trueX - trueY));

        if(distance >= 7) {
            System.out.println("The distance is more than 6.");
        } else if(distance >= 4 && distance <= FAR) {
            System.out.println("The distance is no more than 6.");
        } else if(distance >= 1 && distance <= CLOSE) {
            System.out.println("The distance is no more than 3.");
        } else {
            System.out.println("You have found the treasure!");
        }
    }

    public static void advise() {
        int distance;

        distance = (prevX - prevY) + (trueX - trueY);
        
        if(distance == 0) {
            System.out.println("The same distance");
        } else if(distance >= 1) {
            System.out.println("You are farther.");
        } else {
            System.out.println("You are closer.");
        }
    }
}