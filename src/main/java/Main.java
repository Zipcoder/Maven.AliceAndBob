/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args ) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name: ");

        String userName = scan.nextLine();

        if (userName.equals("Alice") || userName.equals("alice")){
            System.out.println("Your name rules, " + userName + "!");
        } else if (userName.equals("Bob") || userName.equals("bob")){
            System.out.println("Your name rules, " + userName + "!");
        } else {
            System.out.println("Your name sucks,  " + userName + "!");
        }
    }
}
