import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert your name: ");
        String input = scanner.nextLine();

        if ("Bob".equalsIgnoreCase(input)|| "Alice".equalsIgnoreCase(input))
            System.out.println("Hello " + input);
        else
            System.out.println ("Sorry you are not invited.");

    }
}
