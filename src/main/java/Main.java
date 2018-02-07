/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args ){

        Scanner in = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = in.nextLine();

        if (name.equals("Bob") || name.equals("Alice")) {
            System.out.println("Hello " + name);
        } else {
            System.out.println("This place is not for you.  Go away.");
        }



    }
}
