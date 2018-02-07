/**
 * Created by iyasuwatts on 10/17/17.
 */
import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("What is your name?");

        String input = in.nextLine();

        if (input.equalsIgnoreCase("Alice")) {
            System.out.println("Hello " + input);
        } else if (input.equalsIgnoreCase("Bob")) {
            System.out.println("Hello " + input);
        } else {
            System.out.println("Thats not my name");
        }
    }
}
