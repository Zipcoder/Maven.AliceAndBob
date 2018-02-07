import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Hello! What is your name?");
        String userInput = scan1.nextLine();

        if (userInput.equalsIgnoreCase("Alice")){
            System.out.println("Hello Alice!");

        } else if (userInput.equalsIgnoreCase("Bob")){
            System.out.println("Hello Bob!");
        } else {
            System.out.println("You're not Alice or Bob!");
        }

    }
}
