package main.java;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] var0) {
        Scanner in = new Scanner(System.in);
        String[] names = new String[2];
        Boolean sucess = false;

        do {
            System.out.print("Please enter Alice's name: ");
            names[0] = in.nextLine();
            System.out.print("Please enter Bob's name: ");
            names[1] = in.nextLine();

            if (names[0].equalsIgnoreCase("Alice") && names[1].equalsIgnoreCase("Bob")) {
                sucess = true;
            } else {
                System.out.println("Please try again.");
            }
        } while(!sucess);

        System.out.println(names[0] + " and " + names[1] + " are glad you knew their names.");
    }
}
