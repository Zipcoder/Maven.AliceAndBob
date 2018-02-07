/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args ){

        System.out.println("Please enter your name:");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        if (name.equals("Alice") || name.equals("Bob")) {
            System.out.println("Hello " + name + "!");
        } else {
            System.out.println("Who are you?  Go away!");
        }

    }

}
