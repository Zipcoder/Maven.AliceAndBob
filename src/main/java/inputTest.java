import java.util.Scanner;

public class inputTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String nameIn = input.next();
        String expF = "Alice";
        String expM = "Bob";
        if (nameIn.equals(expF) || nameIn.equals(expM)){
            System.out.println("Greetings, " + nameIn);
        }
        else{
            System.out.println("bye felica");
        }
    }
}
