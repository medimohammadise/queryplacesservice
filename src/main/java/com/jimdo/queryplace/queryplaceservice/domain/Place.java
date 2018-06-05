package com.jimdo.queryplace.queryplaceservice.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.net.URI;
@NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class Place {
    private String id;
    private String name;
    private String long_name;
    private String short_name;
    private Location geometry;
    private String icon;
    private String vicinity;
    private java.net.URI URI ;
    /** A list of separate address components that comprise the address of this place. */
    private AddressComponent[] addressComponents;
}
