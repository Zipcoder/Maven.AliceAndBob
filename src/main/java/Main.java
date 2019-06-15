
import java.util.Scanner;
public class Main {

    public static void main(String[] args ){

        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        if (isBob(name)){
            System.out.println("Heya Bob, how're the kids?");
        }
        else if (isAlice(name)){
            System.out.println("Alice!  It's been a while!  How's the Tennis Elbow?");
        }
        else{
            System.out.println("You're not Bob or Alice!  Get the hell out of here!");
        }


    }

    public static boolean isBob (String name){
        if (name.equals("Bob") || name.equals("bob")){
            return true;
        }
            return false;
    }

    public static boolean isAlice (String name){
        if (name.equals("Alice") || name.equals("alice")){
            return true;
        }
        return false;
    }
}
