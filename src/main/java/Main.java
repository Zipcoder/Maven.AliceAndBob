import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){
        //takes user's name as input, ask question as What's your name
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = in.nextLine();
        //greets user when their name is Alice and Bob
        if("Alice".equals(name) || "Bob".equals(name)){
            System.out.println("Hello " + name + "!");
        }
    }
}
