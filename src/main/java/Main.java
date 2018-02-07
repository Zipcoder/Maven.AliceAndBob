import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */



public class Main {

    public static void main(String[] args ){
        Scanner AliceBob = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String person = AliceBob.nextLine();
        if (person.equals("Alice")) {
            System.out.println("Hello" + AliceBob);
        } else if (person.equals("Bob")){
            System.out.println("Hello" + AliceBob);
        }


    }
}
