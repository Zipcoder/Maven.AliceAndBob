/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner nm = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String uname= nm.nextLine();

        if(uname.equals("Bob"))
        {
            System.out.println("Hi Bob!");
        }
        else if (uname .equals("Alice"))
        {
            System.out.println("Hi ALice!");
        }
        else
            System.out.println("You shall not pass!");
        }
    }
