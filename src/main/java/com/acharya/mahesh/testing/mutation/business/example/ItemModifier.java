package com.acharya.mahesh.testing.mutation.business.example;

import com.acharya.mahesh.testing.mutation.business.model.item.Item;

public class ItemModifier {

    public Item getModifiedItem(Item item, String modifier) {
        Item newItem = new Item(item.getItemId() + modifier, item.getItemName() + modifier);
        newItem.setCost(item.getCost() * 1.10);
        newItem.setManaufacturer(item.getItemName());
        newItem.setExpirationDate(item.getExpirationDate());
        newItem.setProductLotNumber(item.getManaufacturer());
        return newItem;
    }

}
