package com.zipcode.logan.aliceandbob;
import java.util.Scanner;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        Person user = new Person(keyboard.nextLine());

        if(user.isBobOrAlice()) {
            user.capitalizeFirst();
            System.out.print("Greetings " + user.getName());
        }
        else {
            System.out.println("Go away!");
        }

    }

}
