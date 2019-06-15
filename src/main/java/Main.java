import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){
        Scanner nameIn = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = nameIn.nextLine();
        if(name.equals("Alice")){
            System.out.println("Welcome, Alice");
        }
        if(name.equals("Bob")){
            System.out.println("Welcome, Bob");
        }

    }
}
