/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.*;

public class Main {

    public static void main(String[] args ){
        Scanner in = new Scanner(System.in);
        String name;

        System.out.print("Please enter your name: ");
        name=in.nextLine();

        if (name.equalsIgnoreCase("Bob") || name.equalsIgnoreCase("Alice"))
        {
            System.out.println("Hello "+name);
        }
    }
}
