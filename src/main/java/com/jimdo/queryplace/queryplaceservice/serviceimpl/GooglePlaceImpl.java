package com.jimdo.queryplace.queryplaceservice.serviceimpl;

import com.jimdo.queryplace.queryplaceservice.domain.Place;
import com.jimdo.queryplace.queryplaceservice.service.Places;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GooglePlaceImpl implements Places {
    @Override
    public String getApiKey() {
        return null;
    }

    @Override
    public void setApiKey(String apiKey) {

    }

    @Override
    public List<Place> getNearbyPlaces(double lat, double lng, double radius, int limit) {
        return null;
    }

    @Override
    public List<Place> getNearbyPlaces(double lat, double lng, double radius) {
        return null;
    }
}
