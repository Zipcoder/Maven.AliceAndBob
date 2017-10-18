public class Person {

    private String name;

    public Person(String n)
    {
        name = n;
    }

    public String IsBob() {
         return ("Bob".equals(name)) ? "Hello " + name: "";

    }

    public String IsAlice() {
        return ("Alice".equals(name)) ? "Hello " + name: "";

    }
}
