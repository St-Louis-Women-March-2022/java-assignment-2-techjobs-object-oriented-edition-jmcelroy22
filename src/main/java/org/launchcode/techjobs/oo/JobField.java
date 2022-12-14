package org.launchcode.techjobs.oo;

import java.util.Objects;

public class JobField {
    private int id;
    private static int nextId = 1;
    private String value;
    //a constructor that accepts no arguments and assigns the value of nextId to the ID field. It then increments the
    //nextId. Thus, every new Employer object will get a different ID number.
    public JobField() {
        id = nextId;
        nextId++;
    }
    //This constructor assigns aValue to the value field. However, it ALSO initializes ID for the object by calling the
    //first constructor with the this(); statement. Including this(); in any Employer constructor makes initializing
    //ID a default behavior.
    public JobField(String value) {
        this();
        this.value = value;
    }

    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {

        return value;
    }

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField jobField = (JobField) o;
        return getId() == jobField.getId();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId());
    }

    // Getters and Setters:

    public int getId() {

        return id;
    }

    public String getValue() {

        return value;
    }

    public void setValue(String value) {

        this.value = value;
    }



}
