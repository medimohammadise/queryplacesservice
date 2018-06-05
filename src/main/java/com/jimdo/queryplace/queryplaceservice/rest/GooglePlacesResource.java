package com.jimdo.queryplace.queryplaceservice.rest;

import com.jimdo.queryplace.queryplaceservice.domain.Place;
import com.jimdo.queryplace.queryplaceservice.service.Places;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class GooglePlacesResource {
    private Places places;

    public GooglePlacesResource(Places places){
        this.places=places;
    }

    @GetMapping("/nearbyPlaces")
    public List<Place> getNearbyPlaces(@RequestParam String query){
        return places.getPlacesByQuery(query,1);
    }
}
