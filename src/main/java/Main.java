/**
 * Created by Timothy Rager on 10/18/17.
 */
import java.util.*;

public class Main {

    public static void main(String[] args ){
        Scanner in = new Scanner(System.in);
        String name;

        System.out.print("Please enter your name: ");
        name=in.nextLine();

        if ("Bob".equalsIgnoreCase(name) || "Alice".equalsIgnoreCase(name))
        {
            System.out.println("Hello "+name);
        }
    }
}
