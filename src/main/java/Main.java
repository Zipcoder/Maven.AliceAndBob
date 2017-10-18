import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 * Edits by katherine on 10/18/17
 */
public class Main {

    public static void main(String[] args ){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name");
        String yourName = scan.nextLine();

        if("Alice".equals(yourName) || "Bob".equals(yourName)) {
            System.out.println("Hello " + yourName);
        }

    }
}
