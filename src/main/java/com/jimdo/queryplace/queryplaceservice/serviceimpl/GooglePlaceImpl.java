package com.jimdo.queryplace.queryplaceservice.serviceimpl;

import com.jimdo.queryplace.queryplaceservice.domain.Place;
import com.jimdo.queryplace.queryplaceservice.dto.PlaceDetailResponse;
import com.jimdo.queryplace.queryplaceservice.dto.PlaceResponse;
import com.jimdo.queryplace.queryplaceservice.service.Places;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Locale;

@Service
public class GooglePlaceImpl implements Places {
    /*
     * Argument #1: API Base URL
     * Argument #2: API Method
     * Argument #3: API Method arguments
     */
    public static String API_URL_FORMAT_STRING = "%s%s/json?%s";
    private final Logger log=LoggerFactory.getLogger(getClass());

    private String apiKey="AIzaSyCViqQT_KOV8T0iQZ286VK7wqLVDQDeCVM";


    private RestTemplate restTemplate;

    public GooglePlaceImpl(RestTemplate restTemplate){
        this.restTemplate=restTemplate;
    }

    @Override
    public String getApiKey() {
        return null;
    }

    @Override
    public void setApiKey(String apiKey) {
        this.apiKey=apiKey;
    }


    @Override
    public List<Place> getNearbyPlaces(double lat, double lng, double radius, int limit) {
        return null;
    }



    private static String buildUrl(String method, String params) {
        String url = String.format(Locale.ENGLISH, API_URL_FORMAT_STRING, API_URL, method, params);
        //url = addExtraParams(url, extraParams);
        url = url.replace(' ', '+');
        return url;
    }
    @Override
    public List<Place> getPlacesByQuery(String query, int limit) {
        PlaceResponse response=null;
        try {
            String uri = buildUrl(METHOD_TEXT_SEARCH, String.format("query=%s&key=%s", query, apiKey));
            response = this.restTemplate.getForObject(uri, PlaceResponse.class);
            System.out.print(response);
            //return getPlaces(uri, METHOD_TEXT_SEARCH, limit);
        } catch (Exception e) {
            e.printStackTrace();
            //throw new GooglePlacesException(e);
        }
        //TODO use exception handling framework to show exceptions
            return  response.getResults();

    }

    @Override
    public Place getPlacesByQueryDetails(String placeId, int limit) {
        PlaceDetailResponse response=null;
        try {
            String uri = buildUrl(METHOD_DETAILS, String.format("placeid=%s&key=%s", placeId, apiKey));
            log.info(uri);
            response = this.restTemplate.getForObject(uri, PlaceDetailResponse.class);
            System.out.print(response);
            //return getPlaces(uri, METHOD_TEXT_SEARCH, limit);
        } catch (Exception e) {
            e.printStackTrace();
            //throw new GooglePlacesException(e);
        }
        //TODO use exception handling framework to show exceptions
        return  response.getResult();

    }



}
