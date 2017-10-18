package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Request user to input first name
        System.out.println("Hello, what is your first name?");

        //Create array for later storing input names
        ArrayList<String> name = new ArrayList<String>;

        //Create scanner to check user input then add to aforementioned array
        Scanner userCheck = new Scanner(System.in);
        userCheck.nextLine().add(name);

        //If name stored in array is "Alice" then greet user
        If(name = "Alice") {
            System.out.println("Greetings, Alice!!!");
        }
        
        //If name stored in array is "Bob" then greet user
        else if(name = "Bob") {
            System.out.println("Greetings, Bob!!!");

        }
        
        //If name stored in array is anything else then do not greet user
        else() {
            System.out.println("I have nothing to say to you!");
        }

    }

}