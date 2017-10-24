/**
 * Created by iyasuwatts on 10/17/17.
 */
import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.*;

public class Main {
    String name = "Bob";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your name: ");

        String name = in.nextLine();
        if (name .equals("Bob") ) {
            System.out.print("Hi " + name);
        } else if (name .equals("Alice") ){
            System.out.print("Hi " + name);
        } else {
            System.out.print("Go Away" );
        }
    }
}