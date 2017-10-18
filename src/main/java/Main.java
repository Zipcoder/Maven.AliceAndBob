/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args ){

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        /*if (name.equals("Bob"))
                System.out.println("Hello Bob");
        else if (name.equals("Alice"))
                System.out.println("Hello Alice");
*/      // BobOrAlice person = new BobOrAlice(name);
       // person.helloBobOrAlice(name);

        Person john_doe = new Person(name);

        System.out.print(john_doe.IsBob());
        System.out.print(john_doe.IsAlice());


    }
}
