import java.util.Scanner;

import static java.util.Scanner.*;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Who might you be?");
        String input;
        input = scanner.nextLine();

        if ("Alice".equalsIgnoreCase(input)||"Bob".equalsIgnoreCase(input)) {
            System.out.println( "Hello, we've been expecting you...");
        } else {
            System.out.println("And, exactly who are you?");
        }

    }
}
