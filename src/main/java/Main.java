/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.*;
public class Main {

    public static void main(String[] args ) {
        Scanner input = new Scanner(System.in);
            System.out.println(" Please write your name!");
            String name = input.nextLine();
            if (name.equals("Alice") || name.equals("Bob")) {
                System.out.println("Hello " + name);
            }

        }

}
