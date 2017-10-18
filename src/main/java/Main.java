import java.util.Scanner;

public class Main {

    public static void main(String[] args ){

        //prompt user to enter name
        System.out.print("Please enter name:");


        //scanner to take in input
        Scanner scanner = new Scanner(System.in);


        //assign user input to next string variable
        String name = scanner.next();

        //create instance of person
        Person namecheck = new Person();

        //call method to check for alice/bob
        namecheck.checkName(name);




    }
}
