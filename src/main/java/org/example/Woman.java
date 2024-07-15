package org.example;

import org.example.Person;
import org.jetbrains.annotations.NotNull;

public class Woman extends Person {

    public Woman  (String firstName, String lastName, int age){
        super (firstName,lastName,age);
    }

    public Woman() {
        super();
    }

    public boolean isRetired(int age) {
        return age >= 60;
    }
    @Override
    protected void updateLastName(@NotNull Person partner) {
        this.setLastName(partner.getLastName());
    }


}
