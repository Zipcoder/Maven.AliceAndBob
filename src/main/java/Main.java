/**
 * Created by iyasuwatts on 10/17/17.
 */
import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.*;

public class Main {

    public static void main(String[] args ){


        Scanner in = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = in.nextLine();

        if (name.equalsIgnoreCase("Alice") || name.equalsIgnoreCase("Bob"))
        {
            System.out.println("Hello " + name);
        }

        }
    }

