public class Person {

    //private variable to hold greeting
    private String greeting = "Greetings";


    public void checkName(String name){

        //condition that checks the user input
        //prints greeting and name provided by user
        if ("Alice".equals(name) || "alice".equals(name))
            System.out.println(greeting + " " + name);

        else if ("Bob".equals(name) || "bob".equals(name))
            System.out.println(greeting + " " + name);
    }

}
