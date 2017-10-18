public class Person {

    private String greeting = "Greetings";


    public void checkName(String name){



        if ("Alice".equals(name) || "alice".equals(name))
            System.out.println(greeting + " " + name);

        else if ("Bob".equals(name) || "bob".equals(name))
            System.out.println(greeting + " " + name);


    }

}
