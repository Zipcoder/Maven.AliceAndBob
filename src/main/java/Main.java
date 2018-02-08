/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {


    public static void main(String[] args ){
    Scanner stdin = new Scanner(System.in);

    System.out.print("Print Name Here");

    String test = stdin.next();

    if (test.equals("Alice")) {
        System.out.print("Hello Alice");
    } else if (test.equals("Bob")) {
        System.out.print("Hello Bob");
    }



    }
}
