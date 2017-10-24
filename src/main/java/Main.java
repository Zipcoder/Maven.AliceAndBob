/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.*;

public class Main {

    public static void main(String[] args ){

        Scanner in = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = in.next();
        if ("bob".equalsIgnoreCase(name) || "alice".equalsIgnoreCase(name)){
            System.out.print("Welcome back");
        }

    }
}
