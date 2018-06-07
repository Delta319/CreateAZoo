package com.company.animals;

public class Lion extends Animal {
    double noseSize;
    double maneLength;
    boolean isTrained;

    public Lion(String name, String location, char gender, double wight, double maneLength, boolean isTrained) {
        super(name, location, gender, wight);
        this.maneLength = maneLength;
        this.isTrained = isTrained;
    }

    public double getNoseSize() {
        return noseSize;
    }

    public void setNoseSize(double noseSize) {
        this.noseSize = noseSize;
    }

    public double getManeLength() {
        return maneLength;
    }

    public void setManeLength(double maneLength) {
        this.maneLength = maneLength;
    }

    public boolean isTrained() {
        return isTrained;
    }

    public void setTrained(boolean trained) {
        isTrained = trained;
    }
}



