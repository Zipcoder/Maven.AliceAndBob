import java.util.Scanner;
/**
 * Created by iyasuwatts on 10/17/17.
 */

//redone with instructor help
public class Main {

    public static void main(String[] args ){
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
       // String user1 = "Alice";
        // String user2 = "Bob";
        /*  if (name.equals("Alice") || name.equals("Bob")){
            System.out.println("Hey!!");
        } else {
            System.out.println("Try Again!");
        }*/

    testingNames( "Alice", name);
    testingNames( "Bob", name);
    }


    //testingNames is your method
    public static void testingNames(String username, String enteredname){
        //this is basically saying if the entered name by the user is equal to the username: "Alice" or "Bob" then print
        if (enteredname.equals(username)){
            System.out.println("Hey!!!");
        }


    }
}
