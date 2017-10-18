/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;

    public class Main {

        public static void main (String[] args) {

            Scanner sc = new Scanner(System.in);

            //ask Alie and Bob for their names
            System.out.println("Please print out your name");
            String name = sc.nextLine();

            //put in array/ can then uppercase first letter? necessary?
            //conditional below not working

            if ("Alice".equals(name) || "Bob".equals(name)) {
                System.out.println("Hello my name is " + name + " ");
            }
        }
    }