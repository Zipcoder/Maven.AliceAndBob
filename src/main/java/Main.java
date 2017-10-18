import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if ("Alice".equals(input) || "Bob".equals(input)); {
            System.out.print("Hello, " + input);
        }
    }
}

