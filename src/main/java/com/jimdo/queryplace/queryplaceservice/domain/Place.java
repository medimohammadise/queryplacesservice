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
    private String description;
    private Location location;
    private String address;
    private java.net.URI URI ;
}
