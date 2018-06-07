package com.company.animals;

public class Rhino extends Animal {
   private double hornSize;
   private String type;
   private Boolean isEndangered;

    public Rhino(String name, String location, char gender, double wight, String type) {
        super(name, location, gender, wight);
        this.type = type;
    }

    public double getHornSize() {
        return hornSize;
    }

    public void setHornSize(double hornSize) {
        this.hornSize = hornSize;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getEndangered() {
        return isEndangered;
    }

    public void setEndangered(Boolean endangered) {
        isEndangered = endangered;
    }
}
