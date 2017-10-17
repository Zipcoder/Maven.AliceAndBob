package com.zipcode.logan.aliceandbob;
import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        Person user = new Person(keyboard.nextLine());
        //String name = keyboard.nextLine();

        if(user.isBobOrAlice()) {
            user.capitalizeFirst();
            //name = name.substring(0,1).toUpperCase() + name.substring(1);
            //name = name.replaceFirst("\b[ab]", name.substring(0,1).toUpperCase());
            System.out.print("Greetings " + user.getName());
        }
        else {
            System.out.println("Go away!");
        }

    }

}
