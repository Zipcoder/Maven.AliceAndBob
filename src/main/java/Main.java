import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */



public class Main {

    public static void main(String[] args ){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String person = input.nextLine();
        if (person.equals("Alice")) {
            System.out.println("Hello " + person);
        } else if (person.equals("Bob")){
            System.out.println("Hello " + person);
        }


    }
}
