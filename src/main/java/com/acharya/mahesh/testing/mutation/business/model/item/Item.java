package com.acharya.mahesh.testing.mutation.business.model.item;

import java.util.Date;

public class Item {

    private final String fItemName;

    private final String fItemID;

    private double fCost;

    private String fManaufacturer;

    private String fProductLotNumber;

    private Date fExpirationDate;

    public Item(String itemID, String itemName) {
        fItemID = itemID;
        fItemName = itemName;
    }

    public double getCost() {
        return fCost;
    }

    public Date getExpirationDate() {
        return fExpirationDate;
    }

    public String getItemId() {
        return fItemID;
    }

    public String getItemName() {
        return fItemName;
    }

    public String getManaufacturer() {
        return fManaufacturer;
    }

    public String getProductLotNumber() {
        return fProductLotNumber;
    }

    public void setCost(double cost) {
        fCost = cost;
    }

    public void setExpirationDate(Date expirationDate) {
        fExpirationDate = expirationDate;
    }

    public void setManaufacturer(String manaufacturer) {
        fManaufacturer = manaufacturer;
    }

    public void setProductLotNumber(String productLotNumber) {
        fProductLotNumber = productLotNumber;
    }

}
