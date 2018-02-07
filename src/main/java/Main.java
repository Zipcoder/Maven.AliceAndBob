import java.util.Scanner;
/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        String user1 = "Alice";
        String user2 = "Bob";

        if (user1 == "Alice" || user2 == "Bob"){
            System.out.println("Hey!!");
        } else {
            System.out.println("Try Again!");
        }

    }
}
