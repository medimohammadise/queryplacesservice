package com.jimdo.queryplace.queryplaceservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
public class ApplicationProperties {

    private  GooglePlaceAPISetting googlePlaceAPISetting;

    public GooglePlaceAPISetting getGooglePlaceAPISetting() {
        return googlePlaceAPISetting;
    }

    public void setGooglePlaceAPISetting(GooglePlaceAPISetting googlePlaceAPISetting) {
        this.googlePlaceAPISetting = googlePlaceAPISetting;
    }

    public static class GooglePlaceAPISetting{
        private String apiKey;
        private String apiURL;
        private String place_search_method;
        private String place_detail_method;
        private String radar_search_method;

        public String getApiKey() {
            return apiKey;
        }

        public void setApiKey(String apiKey) {
            this.apiKey = apiKey;
        }

        public String getApiURL() {
            return apiURL;
        }

        public void setApiURL(String apiURL) {
            this.apiURL = apiURL;
        }

        public String getPlace_detail_method() {
            return place_detail_method;
        }

        public void setPlace_detail_method(String place_detail_method) {
            this.place_detail_method = place_detail_method;
        }

        public String getRadar_search_method() {
            return radar_search_method;
        }

        public void setRadar_search_method(String radar_search_method) {
            this.radar_search_method = radar_search_method;
        }

        public String getPlace_search_method() {

            return place_search_method;
        }

        public void setPlace_search_method(String place_search_method) {
            this.place_search_method = place_search_method;
        }
    }
}


