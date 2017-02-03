package com.ricmeira.joyjetsel.Model;

import java.util.ArrayList;

/**
 * Created by ricar on 2/2/2017.
 */

public class Json {
    String category;
    ArrayList<Item> items;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
}
