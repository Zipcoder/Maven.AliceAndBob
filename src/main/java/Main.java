/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args ){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter name: ");
        // 3. Use the Scanner to read a line of text from the user.
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
