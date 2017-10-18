/**
 * Created by iyasuwatts on 10/17/17.
 */



import java.util.Scanner;

public class Main {

    public static void main(String[] args ){

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if("Alice".equals(input) || "Bob".equals(input)){
            System.out.println ("Hello " + input);



        }
    }
}
