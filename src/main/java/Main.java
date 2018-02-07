import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ) {
;

        Scanner nameGame = new Scanner(System.in);

        System.out.println("What's your name?");
        String userJazz = nameGame.nextLine();

        if (userJazz.equals("Alice") || userJazz.equals("Bob")) {
            System.out.println("Hello " + userJazz + "!");
        } else {
            System.out.println("I don't know you fool!");
        }
    }
}