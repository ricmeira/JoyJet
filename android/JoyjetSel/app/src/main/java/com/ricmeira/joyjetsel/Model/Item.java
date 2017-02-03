package com.ricmeira.joyjetsel.Model;

import java.util.ArrayList;

/**
 * Created by ricar on 2/2/2017.
 */

public class Item {
    String title,description;
    ArrayList<String> galery;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<String> getGalery() {
        return galery;
    }

    public void setGalery(ArrayList<String> galery) {
        this.galery = galery;
    }
}
