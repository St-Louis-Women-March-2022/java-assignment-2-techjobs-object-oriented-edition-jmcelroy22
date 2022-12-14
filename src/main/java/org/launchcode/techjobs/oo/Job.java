package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.


    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
        //this constructor should also call the first in order to initialize the id field. Make sure the parameters are
            //defined in the specific order.
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    public String toString(){
        String s = "\n";
        s += "ID: " + id +"\n";
        if (name==null || name.equals("")){
            s += "Name: Data not available\n";
        } else {
            s += "Name: " + name +"\n";
        }
        if (employer==null || employer.getValue().equals("")){
            s += "Employer: Data not available\n";
        } else {
            s += "Employer: " + employer + "\n";
        }
        if (location==null || location.getValue().equals("")){
            s += "Location: Data not available\n";
        } else {
            s += "Location: " + location + "\n";

        }
        if (positionType==null || positionType.getValue().equals("")){
            s += "Position Type: Data not available\n";
        } else {
            s += "Position Type: " + positionType + "\n";

        }
        if (coreCompetency==null || coreCompetency.getValue().equals("")){
            s += "Core Competency: Data not available\n";
        } else {
            s += "Core Competency: " + coreCompetency + "\n";

        }

        return s;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return this.id==job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
