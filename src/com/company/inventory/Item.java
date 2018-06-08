package com.company.inventory;

public class Item {
    private double price;
    private String itemName;
    private double quantity;
    private String dateRecieved;

    public Item(double price, String itemName, double quantity, String dateRecieved) {
        this.price = price;
        this.itemName = itemName;
        this.quantity = quantity;
        this.dateRecieved = dateRecieved;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getDateRecieved() {
        return dateRecieved;
    }

    public void setDateRecieved(String dateRecieved) {
        this.dateRecieved = dateRecieved;
    }
}
