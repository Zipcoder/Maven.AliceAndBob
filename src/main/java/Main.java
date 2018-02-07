/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args ){
        Scanner in = new Scanner(System.in);
        System.out.println("what's your name??");
        String name = in.nextLine().toLowerCase();
        switch (name) {
            case "alice":
                System.out.println("What's up, Alice?");
                break;
            case "bob":
                System.out.println("Hey, Bob!");
                break;
            default:
                System.out.println("Who are you tho?");
                break;
        }
    }
}
