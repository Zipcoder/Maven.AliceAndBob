package com.zipcode.logan.aliceandbob;

public class Person {

    private String name;
    private boolean acceptable;

    public Person(String str) {
        name = str;
    }

    public String getName() {
        return name;
    }

    public void setName(String s) {
        name = s;
    }

    public String capitalizeFirst() {
        name = name.substring(0,1).toUpperCase() + name.substring(1);
        return name;
    }

    public boolean isBobOrAlice() {
        if ("Alice".equalsIgnoreCase(name) || "Bob".equalsIgnoreCase(name)) {
            acceptable = true;
        }
        return acceptable;
    }
}
