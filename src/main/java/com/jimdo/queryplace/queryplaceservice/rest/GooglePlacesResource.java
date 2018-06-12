package com.jimdo.queryplace.queryplaceservice.rest;

import com.jimdo.queryplace.queryplaceservice.dto.PlaceDetailResponse;
import com.jimdo.queryplace.queryplaceservice.dto.PlaceResponse;
import com.jimdo.queryplace.queryplaceservice.service.Places;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GooglePlacesResource {
    private Places places;

    public GooglePlacesResource(Places places){
        this.places=places;
    }

    @GetMapping("/place")
    public PlaceResponse getPlace(@RequestParam String query){

        return places.getPlacesByQuery(query);
    }

    @GetMapping("/placeDetails")
    public PlaceDetailResponse getPlaceDetails(@RequestParam String query){
        return places.getPlacesByQueryDetails(query);
    }

    @GetMapping("/placeByradar")
    public PlaceResponse getPlaceByRadar(@RequestParam double lat,@RequestParam double lng,@RequestParam double radius,@RequestParam  String type){
        return places.getPlacesByRadar(lat, lng, radius,type);
    }
}
