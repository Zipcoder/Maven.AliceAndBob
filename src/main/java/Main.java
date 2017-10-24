import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){

        System.out.println("What is your name?");
        Scanner keyboard = new Scanner(System.in);
        String name = keyboard.nextLine();
        if ("Alice".equals(name) || "Bob".equals(name)) {
            System.out.println("Greetings " + name);
        }
    }

}
