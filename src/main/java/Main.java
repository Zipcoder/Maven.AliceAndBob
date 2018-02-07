import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){
        Scanner name = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String nameInput = name.nextLine();
        if (nameInput.equalsIgnoreCase("Alice" )| nameInput.equalsIgnoreCase( "Bob")) {
            System.out.println("Hello " + nameInput);
        }

    }
}
