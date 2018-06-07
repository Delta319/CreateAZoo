package com.company.people;

public class People {
    double age;
    String name;
    char gender;
    String race;

    public People(double age, String name, char gender, String race) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.race = race;
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

    public void setRace(String race) {
        this.race = race;
    }
}
