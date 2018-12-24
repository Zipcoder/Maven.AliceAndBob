/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args ){
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter name: ");

        String userInput = input.nextLine();

        if (userInput.equalsIgnoreCase("Alice")){
            System.out.println("Hello " + userInput);
        } else if (userInput.equalsIgnoreCase("Bob")) {
            System.out.println("Hello " + userInput);
        } else {
            System.out.println("YOU ARE NOT ALICE OR BOB!!");
        }
    }
}
