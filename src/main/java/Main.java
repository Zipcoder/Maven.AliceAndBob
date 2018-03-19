/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args ) {

        Scanner input = new Scanner(System.in);
        System.out.println("Hi there! What's your name?");
        String name = input.nextLine();

        if (isMatch(name)) {
            System.out.println("Hi " + name);
        }

    }

    public static boolean isMatch(String name) {

        if (name.toLowerCase().equals("bob") || name.toLowerCase().equals("alice")) {
            return true;
        }

        return false;
    }
}
