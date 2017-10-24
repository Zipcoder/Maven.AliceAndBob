/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args ){

        Scanner scanner =  new Scanner(System.in);
        System.out.println("Please enter yout name: ");
        String input = scanner.nextLine();

        //System.out.println("The user has input >>" + input);

       /* if(input.equals("Alice")) {
            System.out.println("Hello " + input + " how are you doing today?");
           } else if ("Bob".equals(input)) {
                System.out.println(" Hello " + input + " how are you doing today?");
           } else {
            System.out.println("You do not belong!!!!");
        }
        8*/




        if("Alice".equalsIgnoreCase(input) || "Bob".equalsIgnoreCase(input)){
            System.out.println("Hello " + input + ", how are you doing today?");
        } else {
            System.out.println("You do not belong in this file!!!!");
        }



    }
}
