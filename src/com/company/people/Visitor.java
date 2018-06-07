package com.company.people;

public class Visitor extends People{
   private double groupSize;
   private String allergies;
   private boolean membership;
   private String homeAddress;

    public Visitor(double age, String name, char gender, String race, double groupSize, boolean membership, String homeAddress) {
        super(age, name, gender, race);
        this.groupSize = groupSize;
        this.membership = membership;
        this.homeAddress = homeAddress;
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

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }
}
