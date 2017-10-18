package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter name:");

        Scanner nameInput = new Scanner(System.in);
        String name = nameInput.nextLine();

        if ("Alice".equals(name)){

            System.out.println("Hello!");

        }

        else if("Bob".equals(name)){

            System.out.println("Hello!");

        }
    }
}
