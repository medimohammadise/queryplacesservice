package com.jimdo.queryplace.queryplaceservice.service;

import com.jimdo.queryplace.queryplaceservice.domain.Place;

import java.util.List;

public interface Places {
    /**
     * The URL of which Google Places API is located.
     */
    String API_URL = "https://maps.googleapis.com/maps/api/place/";
    // METHODS
    String METHOD_NEARBY_SEARCH = "nearbysearch";
    String METHOD_TEXT_SEARCH = "textsearch";
    String METHOD_RADAR_SEARCH = "radarsearch";
    String METHOD_DETAILS = "details";

    /**
     * Returns the API key associated with this Places object.
     *
     * @return api key
     */
    String getApiKey();

    /**
     * Sets the API key associated with this Places object.
     *
     * @param apiKey to set
     */
    void setApiKey(String apiKey);

    /**
     * Returns the service at the specified latitude and longitude within the specified radius. If the specified limit
     * is greater than {@link #MAXIMUM_PAGE_RESULTS}, multiple HTTP GET requests may be made if necessary.
     *
     * @param lat         latitude
     * @param lng         longitude
     * @param radius      radius
     * @param limit       the maximum amount of service to return
     * @param extraParams any extra parameters to include in the request URL
     * @return a list of service that were found
     */


    List<Place> getNearbyPlaces(double lat, double lng, double radius, int limit);


    /**
     * Returns the places that match the specified search query.  If the specified limit
     * is greater than {@link #MAXIMUM_PAGE_RESULTS}, multiple HTTP GET requests may be made if necessary.
     *
     * @param query       search query
     * @param limit       the maximum amount of places to return
     * @param extraParams any extra parameters to include in the request URL
     * @return a list of places that were found
     */
    List<Place> getPlacesByQuery(String query, int limit);



}
