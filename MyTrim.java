import java.util.*;

public class MyTrim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string input and String list: ");

        String str = "UniversIty of Miami";
        String list = "ciIty";

        System.out.println("str: " + str);
        System.out.println("list: " + list);

        System.out.println(myTrim2(str, list));
    }

    public static String myTrim(String str, String list) {
        String temp = "";

        for(char i: str.toCharArray()) {
            for(char j: list.toCharArray()) {
                if(i != j) {
                    temp = str.replace(Character.toString(i), "");
                }
            }
        }
        return temp;
    }

    public static String myTrim2(String str, String list) {
        String temp = "";
        String newTemp = "";
        temp = myTrim(str, list);
        
        for(char i: temp.toCharArray()) {
            for(char j: list.toCharArray()) {
                if(Character.isUpperCase(i) != Character.isUpperCase(j)) {
                    newTemp = temp.replace(Character.toString(i), "");
                }
            }
        }
        return temp;
    }
}