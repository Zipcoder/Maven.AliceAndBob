import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Enter Name");

        Scanner in = new Scanner(System.in);

        String name = in.nextLine();


        if ("Alice".equalsIgnoreCase(name) || "Bob".equalsIgnoreCase(name) ) {
            System.out.print("Hello " + name);

        } else {
            System.out.println("Hello "+ name + ", you are not Alice or Bob");


        }
    }
}
