package com.company.people.inventory;

public class gifts {
    private String type;
    private String identificationNumber;

    public gifts(String type, String identificationNumber) {
        this.type = type;
        this.identificationNumber = identificationNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }
}
