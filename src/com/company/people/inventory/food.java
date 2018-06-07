package com.company.people.inventory;

public class food {
    private String category;
    private String expirationDate;
    private boolean isRefrigerated;

    public food(String category, String expirationDate, boolean isRefrigerated) {
        this.category = category;
        this.expirationDate = expirationDate;
        this.isRefrigerated = isRefrigerated;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public boolean isRefrigerated() {
        return isRefrigerated;
    }

    public void setRefrigerated(boolean refrigerated) {
        isRefrigerated = refrigerated;
    }
}
