package com.example.aristos.thessieee;

/**
 * Created by Aristos on 7/17/2017.
 */

public class Item {

    private String tName;
    private String tAbility;
    //we want different intents for every item on the listview!
    private String tURIparse;
    private int tImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    // Constructor is used to initialize variables
    public Item(String defaultName, String defaultAbility, int imageResourceId, String defaultURIparse) {

        tName = defaultName;
        tAbility = defaultAbility;
        tImageResourceId = imageResourceId;
        //
        tURIparse = defaultURIparse;
    }

    public String getName() {
        return tName;
    }

    public String getAbility() {
        return tAbility;
    }

    public String getURIparse() {
        return tURIparse;
    }

    public int getImageResourceId() {
        return tImageResourceId;
    }

    //returns whether or not there is an image for this person
    public boolean hasImage() {
        return tImageResourceId != NO_IMAGE_PROVIDED;
    }


}
