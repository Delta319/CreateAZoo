package com.company.animals;

public class Rabbit extends Animal {


    double earLength;
    String furColor;
    String favoriteFood;

    public Rabbit(String name, String location, char gender, double weight, double earLength, String furColor) {
        super(name, location, gender, weight);
        this.earLength = earLength;
        this.furColor = furColor;

    }


    public double getEarLength() {
        return earLength;
    }

    public void setEarLength(double earLength) {
        this.earLength = earLength;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }
}
