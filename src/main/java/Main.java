import java.util.Scanner;

public class Main {
//Write a program which prompts the user to input his/her name.
//The program should greet users whose names are 'Alice' and 'Bob'.
//Understand how to get input from user
//Create conditional to check against Alice and Bob
//Print greeting to screen if Alice or Bob are true

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter your name.");
    String userInput = scanner.nextLine();


    if ("Alice".equals(userInput) || "Bob".equals(userInput)){
        System.out.print("Hello, " + userInput + ".");
    }

    }
}

