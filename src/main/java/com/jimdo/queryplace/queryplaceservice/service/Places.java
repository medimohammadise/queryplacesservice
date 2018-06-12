package com.jimdo.queryplace.queryplaceservice.service;

import com.jimdo.queryplace.queryplaceservice.domain.Place;
import com.jimdo.queryplace.queryplaceservice.dto.PlaceDetailResponse;
import com.jimdo.queryplace.queryplaceservice.dto.PlaceResponse;

import java.util.List;

public interface Places {

    /**
     * Returns the API key associated with this Places object.
     *
     * @return api key
     */
    String getApiURL();

    /**
     * Returns the API key associated with this Places object.
     *
     * @return api key
     */
    String getApiKey();

    String getPlaceSearchMethodName();
    String getPlaceDetailSearchMethodName();
    String getRadarSearchMethodName();

    /**
     * Returns the places that match the specified search query.  If the specified limit
     * is greater than {@link #MAXIMUM_PAGE_RESULTS}, multiple HTTP GET requests may be made if necessary.
     *
     * @param query       search query
     * @param limit       the maximum amount of places to return
     * @param extraParams any extra parameters to include in the request URL
     * @return a list of places that were found
     */
    PlaceResponse getPlacesByQuery(String query);

    PlaceDetailResponse getPlacesByQueryDetails(String query);

    PlaceResponse getPlacesByRadar(double lat, double lng,double radius,String type);


    }
