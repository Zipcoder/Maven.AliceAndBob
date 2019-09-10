import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){

        Scanner name = new Scanner(System.in);
        System.out.println("Please enter your name");
        String input = name.nextLine();
        if (input.equalsIgnoreCase("Alice")) {
            System.out.println("Hello Alice!");
        }
        else if (input.equalsIgnoreCase("Bob")) {
            System.out.println("Hello Bob!");
        }
        else{
            System.out.println();;
        }
    }
}
