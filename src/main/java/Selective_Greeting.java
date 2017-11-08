import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Selective_Greeting {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);// created a Scanner object named "in" to store the name data
        System.out.println("Please insert your name: "); //request users to insert their name
        String input= scanner.nextLine();  // save the input into a location which is saved in variable "name"
       if ("BOB".equalsIgnoreCase(input) || "ALICE".equals(input))
                System.out.println("Hello " + input.toUpperCase()); // if  Alice, it greets
                else
                System.out.println(" I am sorry, you are not invited"); //Else it doesnt

        }
    }

