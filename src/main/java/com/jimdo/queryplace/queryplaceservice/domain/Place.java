package com.jimdo.queryplace.queryplaceservice.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.jimdo.queryplace.queryplaceservice.PlaceAPIProvider;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor @AllArgsConstructor @Getter @Setter
@JsonIgnoreProperties(ignoreUnknown=true)
public class Place {
    private String id;

    private String place_id;
    private String name;
    private String long_name;
    private String short_name;
    private Geometry geometry;
    private String icon;
    private String vicinity;
    private java.net.URI URI ;
    /** A list of separate address components that comprise the address of this place. */
    private AddressComponent[] address_components;

    private String formatted_address;
    private PlaceAPIProvider provider;
}
