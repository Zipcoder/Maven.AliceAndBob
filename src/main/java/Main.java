/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args ){

        Scanner scanner = new Scanner(System.in);

        String input;

        do {
            System.out.print("Please enter your name: ");
            input = scanner.nextLine();

            if (input.equals("Alice")) {
                System.out.println("Hello Alice");
                break;
            } else if (input.equals("Bob")) {
                System.out.println("Hello Bob");
                break;
            } else {
                System.out.println("Your name is not \"Alice\" or \"Bob.\" Please try again.");
            }

        } while (!input.equals("Alice") && !input.equals("Bob"));

    }
}
