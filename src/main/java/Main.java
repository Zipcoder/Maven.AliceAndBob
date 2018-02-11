/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String usersName;

        System.out.println("Hello! Please enter your name: ");
        usersName = sc.nextLine();

        if (usersName.equals("Alice") || usersName.equals("Bob")) {
            System.out.println("Hello " + usersName + ", nice to meet you!");
        } else{
            System.out.println("Hello " + usersName + ", you are not a member!");}
    }
}
