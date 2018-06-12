package com.jimdo.queryplace.queryplaceservice;

public enum PlaceAPIProvider {
    GOOGLE_PLACE("Google"),
    YELP("Yelp"),
    FOUR_SQUARE("FourSquare");
    private String providerName;
    PlaceAPIProvider(String providerName){
        this.providerName=providerName;
    }
}
