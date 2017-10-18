public class checkName {
    private String name;
    private String result;

    // constructor
    public checkName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getResult() {
        return result;
    }

    public void answer() {
        if (name.equals("Alice")) {
            this.result = "Hello Alice";
        }
        else if (name.equals("Bob")) {
            this.result = "Hello Bob";
        }
        else {
            System.exit(0);
        }
    }
}
