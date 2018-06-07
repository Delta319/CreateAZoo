package com.company.people;

public class Visitors extends People{
    double groupSize;
    String allergies;
    boolean membership;
    String location;

    public Visitors(double groupSize, boolean membership, String location) {
        this.groupSize = groupSize;
        this.membership = membership;
        this.location = location;
    }

    public double getGroupSize() {

        return groupSize;
    }

    public void setGroupSize(double groupSize) {
        this.groupSize = groupSize;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public boolean isMembership() {
        return membership;
    }

    public void setMembership(boolean membership) {
        this.membership = membership;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
