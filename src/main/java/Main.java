import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */

public class Main {

    public static void main(String[] args) {

        Scanner name = new Scanner(System.in);
        System.out.println("Enter your name");
        String answer = name.next();

        if (answer.equalsIgnoreCase("Alice")) {
            System.out.println("Hello and Greetings");
        } else if (answer.equalsIgnoreCase("Bob")) {
            System.out.println("Hello and Greetings");
        } else {
            System.out.println("Your not is not Alice or Bob");
        }
    }
}
