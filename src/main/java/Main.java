import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] greetNames = {"alice", "bob"};

        System.out.println("What is your name?");
        String name = in.nextLine();

        Person person = new Person(name);

        for (int i = 0; i < greetNames.length; i++) {
            if (greetNames[i].equalsIgnoreCase(person.getName()))
                System.out.println("Hello, " + name + "!");
        }
    }
}