package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Request user to input first name
        System.out.println("Hello, what is your first name?");
        //Create scanner to check user input and add to string "name"
        Scanner userCheck = new Scanner(System.in);
        String name = userCheck.nextLine();

        //If name stored in string is "Alice" then greet user
        if(name.equals("Alice")) {
            System.out.println("Greetings, Alice!!!");
        }

        //If name stored in string is "Bob" then greet user
        else if(name.equals("Bob")) {
            System.out.println("Greetings, Bob!!!");

        }

        //If name stored in array is anything else then do not greet user
        else {
            System.out.println("I have nothing to say to you!");
        }

    }

}