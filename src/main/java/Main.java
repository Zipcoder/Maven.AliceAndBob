/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please insert your name: ");
            String input = scanner.nextLine();

            if ("Bob".equalsIgnoreCase(input)|| "Alice".equalsIgnoreCase(input))
                System.out.println("Hello " + input);
            else
                System.out.println ("Sorry you are not invited.");
            System.out.println(System.getProperty("user.dir"));

        }
    }