import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */


public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first name.");
        String usersName = input.nextLine();
        if(usersName.equalsIgnoreCase("alice") || usersName.equalsIgnoreCase("bob")){
            System.out.println("Sup, " + usersName);
        } else {
            System.out.println("We're sorry. We don't like you. You don't get a greeting. Have a nice day.");
            }
    }
}































/*
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name");
        String usersName = input.nextLine();
        if (usersName.equalsIgnoreCase("Alice") || usersName.equalsIgnoreCase("bob")){
            System.out.println("Sup, " + usersName);
        } else {
            System.out.println("Sorry. We don't like you. You don't get a greeting. Have a nice day.");
        }
    }


}

*/
