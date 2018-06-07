package com.company.animals;

public class Animal {
    private String name;
    private String location;
    private char gender;
    private double wight;

    public Animal(String name, String location, char gender, double wight) {
        this.name = name;
        this.location = location;
        this.gender = gender;
        this.wight = wight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }
}
