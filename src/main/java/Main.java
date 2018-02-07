import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){

        Scanner myTest = new Scanner(System.in);
        System.out.println("What is your name?");
        String username = myTest.nextLine();

        if (username.equalsIgnoreCase("Alice") || username.equalsIgnoreCase("Bob")) {
            System.out.println("Hello " + username);
        } else {
                System.out.println("Go away!");
            }
        }
    }
