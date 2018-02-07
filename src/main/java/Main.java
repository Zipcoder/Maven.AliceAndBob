/**
 * Created by iyasuwatts on 10/17/17.
 */
import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

public class Main {
// my first comment
    public static void main(String[] args ){

 Scanner in = new Scanner(System.in);

// get first input here
        System.out.println("What is your name?");
        String userName = in.nextLine();

        if (userName.equals("Bob") || userName.equals("Alice")) {
            System.out.println("Hello, " + userName);
        } else  {
            System.out.println("You are not my friend");
        }
        }


}
