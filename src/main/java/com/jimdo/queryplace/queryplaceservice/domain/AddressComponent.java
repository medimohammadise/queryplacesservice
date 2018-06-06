package com.jimdo.queryplace.queryplaceservice.domain;

import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;
public class AddressComponent implements Serializable {
    private static final long serialVersionUID = 1L;

    /** The full text description or name of the address component as returned by the Geocoder. */
    public String long_name;

    /**
     * An abbreviated textual name for the address component, if available. For example, an address
     * component for the state of Alaska may have a longName of "Alaska" and a shortName of "AK" using
     * the 2-letter postal abbreviation.
     */
    public String short_name;

    /** Indicates the type of each part of the address. Examples include street number or country. */
    //public AddressComponentType[] types;
}
