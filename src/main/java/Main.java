import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = reader.next();
        if (name.equals("Alice")){
            System.out.println("Hello Alice!");
        } else if (name.equals("Bob")){
            System.out.println("Hello Bob!");
        }
    }
}
