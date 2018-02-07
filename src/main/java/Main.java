/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args ){

        Scanner name_input = new Scanner( System.in );
        System.out.println("Who is this?");
        String username = name_input.nextLine();

    if (username.equals("Bob") || username.equals("Alice") ) {
            System.out.println("Welcome back senpai!");
        }
        else {
            System.out.println("GTFO Bruh!");
        }




    }
}
