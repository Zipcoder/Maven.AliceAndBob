

import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);// created a Scanner object named "in" to store the name data
        System.out.println("Please insert your name: "); //request users to insert their name
        String name = in.nextLine().toUpperCase();  // save the input into a location which is saved in variable "name"
        switch (name) {
            case "Alice":
                // if (name == "ALICE" || name == "BOB") didnt work, cant figure out why
                System.out.println("Hello" + name); // if  Alice, it greets
                break;
            case "BOB":
                System.out.println("Hello " + name); // if Bob also, it greets
                break;
            default:

                System.out.println(" I am sorry, you are not invited"); //Else it doesnt

        }
    }
}
