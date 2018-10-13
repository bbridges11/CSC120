import java.util.*;

public class NiftyPrint {
    //final String INPUT1;
    static StringBuilder lineBuilder = new StringBuilder("");
    static StringBuilder wordBuilder = new StringBuilder("");

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int width, option;
        //String text;

        System.out.print("Enter width: ");
        width = input.nextInt();

        System.out.print("Enter formatting option \n" + "LEFT=0, RIGHT=1, CENTER=2: ");
        option = input.nextInt();

        System.out.print("Input text: ");
        String text = input.next();

        format(text, width, option);
    }

    public static void format( String text, int width, int option ) {
        if(!text.endsWith("\n")) {
            text.concat("\n");
        }
        
        text.replace('\t', ' ');

        for(int i = 0; i < text.length(); i++) {
            if(text.charAt(i) != ' ' && text.charAt(i) != '\n') {
                wordBuilder.append(text.charAt(i));
            } else {
                if(wordBuilder.length() > 0) {
                    if(lineBuilder.length() == 0) {
                        lineBuilder.append(wordBuilder);
                    }
                    if(lineBuilder.length() > 0 && lineBuilder.length() + wordBuilder.length() + 1 <= width) {
                        lineBuilder.append(" " + wordBuilder);
                    }
                    if(lineBuilder.length() >= 0 && lineBuilder.length() + wordBuilder.length() >= width) {
                        flush(lineBuilder, width, option);
                        lineBuilder.append(wordBuilder);
                    }
                }
            }
                if(i == '\n') {
                    flush(lineBuilder, width, option);
                    lineBuilder.setLength(0);
                }
                //wordBuilder.setLength(0);
            
        }
        flush(wordBuilder, width, option);
        wordBuilder.setLength(0);
    }
    private static void flush( StringBuilder builder, int width, int option ) {
        if(option == 0) {
            String format = "%-" + width + "s";
            System.out.printf(format, builder);
            lineBuilder.setLength(0);
            System.out.println();
        } else if(option == 1) {
            String format = "%" + width + "s";
            System.out.printf(format, builder);
            lineBuilder.setLength(0);
            System.out.println();
        } else if(option == 2) {
            System.out.printf("%+widths", builder);
            lineBuilder.setLength(0);
            System.out.println();
        } else {
            System.out.println("Invalid option chosen");
        }
    }
}