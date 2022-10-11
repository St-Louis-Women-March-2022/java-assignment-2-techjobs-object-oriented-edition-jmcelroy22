package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Employer extends JobField {

    //This constructor assigns aValue to the value field. However, it ALSO initializes ID for the object by calling the
    //first constructor with the this(); statement. Including this(); in any Employer constructor makes initializing
    //ID a default behavior.
    public Employer(String value) {
        super(value);
    }




    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Employer)) return false;
        return super.equals(o);

    }

}