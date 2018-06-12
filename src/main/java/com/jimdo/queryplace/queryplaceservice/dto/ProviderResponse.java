package com.jimdo.queryplace.queryplaceservice.dto;

import com.jimdo.queryplace.queryplaceservice.PlaceAPIProvider;
import com.jimdo.queryplace.queryplaceservice.domain.Place;

import java.util.List;

public class ProviderResponse {
    private PlaceAPIProvider provider;
    private List<Place> placeList;
}
