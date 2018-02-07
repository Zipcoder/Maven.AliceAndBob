import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name.");
        String input = sc.nextLine();
        if (input.equals("Alice")) {
            System.out.println("Hello Alice!");
        } else if (input.equals("Bob")) {
            System.out.println("Hello Bob!");
        }
    }
}
