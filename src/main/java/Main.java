/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;


public class Main {

    public static void main(String[] args ){
        System.out.println("Please enter your name");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        switch (name) {
            case "Alice":
                System.out.println("Welcome Alice");
                break;
            case "Bob":
                System.out.println("Welcome Bob");
                break;
            case "bob":
                System.out.println("Welcome Bob");
                break;
            case "alice":
                System.out.println("Welcome Alice");
                break;
            default:
                System.out.println("Who?");
        }
    }
}