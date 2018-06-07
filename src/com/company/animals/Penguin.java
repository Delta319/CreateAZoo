package com.company.animals;

public class Penguin extends Animal {
    String type;
    String featherType;
    Double wingspan;

    public Penguin(String name, String location, char gender, double wight) {
        super(name, location, gender, wight);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFeatherType() {
        return featherType;
    }

    public void setFeatherType(String featherType) {
        this.featherType = featherType;
    }

    public Double getWingspan() {
        return wingspan;
    }

    public void setWingspan(Double wingspan) {
        this.wingspan = wingspan;
    }
}
