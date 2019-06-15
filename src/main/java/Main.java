import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String userName = userInput.nextLine();
        if (userName.equals("Alice")) {
            System.out.println("Hello, Alice!");
        }
        else if (userName.equals("Bob")) {
            System.out.println("Hello Bob!");
        }



    }
}










