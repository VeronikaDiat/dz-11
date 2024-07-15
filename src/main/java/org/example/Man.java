package org.example;

public class Man extends Person {

    public Man (String firstName, String lastName, int age){
        super (firstName,lastName,age);
    }

    public Man() {
        super();
    }

    public boolean isRetired() {
        int age = 22;
        return age >= 65;
    }  @Override
    protected void updateLastName(Person partner) {
    }
}
