
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        checkName person = new checkName(scanner.nextLine());
        person.answer();
        System.out.println(person.getResult());
    }
}


