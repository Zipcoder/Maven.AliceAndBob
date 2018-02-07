import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");

        String userName = sc.next();
        System.out.println("Hello, " + userName + "!");

    }
}
