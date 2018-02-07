import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("What is your name?");
        name = scanner.next();

        if (name.toLowerCase().equals("bob") || name.toLowerCase().equals("alice")){
            System.out.println("Hi!");
        }

        else {
            System.out.println("You're not Bob or Alice");
        }
    }

}
