package com.acharya.mahesh.testing.mutation.business.example;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;

import com.acharya.mahesh.testing.mutation.business.model.item.Item;

public class ItemModifierTest {

    private Item createItem(String id, String name, Date expirationDate, String mfr, String lotNbr) {
        Item item = new Item(id, name);
        item.setCost(5.0);
        item.setExpirationDate(expirationDate);
        item.setManaufacturer(mfr);
        item.setProductLotNumber(lotNbr);
        return item;
    }

    @Test
    public void getModifiedItem_validItem_itemModified() {
        Date date = new Date();
        String modifier = "modified";
        Item item = createItem("32I32K32J", "laptop", date, "apple", "2017-mac-238478");
        Item modifiedItem = new ItemModifier().getModifiedItem(item, modifier);
        assertEquals(item.getItemId() + modifier, modifiedItem.getItemId());
    }

}
