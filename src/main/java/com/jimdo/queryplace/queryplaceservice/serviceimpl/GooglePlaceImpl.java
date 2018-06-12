package com.jimdo.queryplace.queryplaceservice.serviceimpl;

import com.jimdo.queryplace.queryplaceservice.PlaceAPIProvider;
import com.jimdo.queryplace.queryplaceservice.config.ApplicationProperties;
import com.jimdo.queryplace.queryplaceservice.dto.PlaceDetailResponse;
import com.jimdo.queryplace.queryplaceservice.dto.PlaceResponse;
import com.jimdo.queryplace.queryplaceservice.service.Places;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.security.PublicKey;
import java.util.Locale;

@Service
public class GooglePlaceImpl implements Places {
    /*
     * Argument #1: API Base URL
     * Argument #2: API Method
     * Argument #3: API Method arguments
     */
    public static String API_URL_FORMAT_STRING = "%s%s/json?%s";
    private final Logger log = LoggerFactory.getLogger(getClass());

    private RestTemplate restTemplate;
    private ApplicationProperties applicationProperties;

    private PlaceAPIProvider provider = PlaceAPIProvider.GOOGLE_PLACE;

    public GooglePlaceImpl(RestTemplate restTemplate, ApplicationProperties applicationProperties) {
        this.restTemplate = restTemplate;
        this.applicationProperties = applicationProperties;
    }

    private  String buildUrl(String method, String params) {
        String url = String.format(Locale.ENGLISH, API_URL_FORMAT_STRING, getApiURL() , method, params);
        //url = addExtraParams(url, extraParams);
        url = url.replace(' ', '+');
        return url;
    }



    @Override
    public String getApiURL() {
        return this.applicationProperties.getGooglePlaceAPISetting().getApiURL();
    }

    @Override
    public String getApiKey() {
        return this.applicationProperties.getGooglePlaceAPISetting().getApiKey();
    }

    @Override
    public String getPlaceSearchMethodName() {
        return this.applicationProperties.getGooglePlaceAPISetting().getPlace_search_method();
    }

    @Override
    public String getPlaceDetailSearchMethodName() {
        return this.applicationProperties.getGooglePlaceAPISetting().getPlace_detail_method();
    }

    @Override
    public String getRadarSearchMethodName() {
        return this.applicationProperties.getGooglePlaceAPISetting().getRadar_search_method();
    }

    @Override
    public PlaceResponse getPlacesByQuery(String query) {
        PlaceResponse response = null;
        try {
            String uri = buildUrl(getPlaceSearchMethodName(), String.format("query=%s&key=%s", query, getApiKey()));
            response = this.restTemplate.getForObject(uri, PlaceResponse.class);
            response.setProvider(provider);
        } catch (Exception e) {
            e.printStackTrace();
            //throw new GooglePlacesException(e);
        }
        //TODO use exception handling framework to show exceptions
        return response;

    }

    @Override
    public PlaceDetailResponse getPlacesByQueryDetails(String placeId) {
        PlaceDetailResponse response = null;
        try {
            String uri = buildUrl(getPlaceDetailSearchMethodName(), String.format("placeid=%s&key=%s", placeId, getApiKey()));
            response = this.restTemplate.getForObject(uri, PlaceDetailResponse.class);
            response.setProvider(provider);
        } catch (Exception e) {
            e.printStackTrace();
            //throw new GooglePlacesException(e);
        }
        //TODO use exception handling framework to show exceptions
        return response;

    }

    @Override
    public PlaceResponse getPlacesByRadar(double lat, double lng, double radius, String type) {
        PlaceResponse response = null;
        String uri = buildUrl(getRadarSearchMethodName(), String.format(Locale.ENGLISH, "key=%s&location=%f,%f&radius=%f&type=%s",
                getApiKey(), lat, lng, radius, type));
        try {
            response = this.restTemplate.getForObject(uri, PlaceResponse.class);
            response.setProvider(provider);
        } catch (Exception e) {
            e.printStackTrace();
            //throw new GooglePlacesException(e);
        }
        return response;
    }


}
