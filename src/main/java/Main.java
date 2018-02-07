import java.util.*;
public class Main {

    public static void main(String[] args ){

        Scanner scan = new Scanner(System.in);
        System.out.println("Are you Alice or Bob?");

        String name = scan.nextLine();

        if(name.equals("Alice")) {
            System.out.println("Hi Alice");
        } else if( name.equals("Bob")) {
            System.out.println("Hi Bob");
        } else {
            System.out.println("Leon? Is that you?");
        }

    }
}
