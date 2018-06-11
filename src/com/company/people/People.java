package com.company.people;

public class People {
   private double age;
   private String name;
   private char gender;
   private String race;

    public People(double age, String name, char gender, String race) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.race = race;
    }

    public People() {
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getRace() {
        return race;
    }

}
