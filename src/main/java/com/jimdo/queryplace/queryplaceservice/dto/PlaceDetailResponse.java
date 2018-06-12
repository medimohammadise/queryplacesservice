package com.jimdo.queryplace.queryplaceservice.dto;

import com.jimdo.queryplace.queryplaceservice.PlaceAPIProvider;
import com.jimdo.queryplace.queryplaceservice.domain.Place;

import java.io.Serializable;
import java.util.List;

public class PlaceDetailResponse implements Serializable {
    private List<String> html_attributions;
    private Place result;
    private String status;
    private PlaceAPIProvider provider;

    public List<String> getHtml_attributions() {
        return html_attributions;
    }

    public void setHtml_attributions(List<String> html_attributions) {
        this.html_attributions = html_attributions;
    }

    public Place getResult() {
        return result;
    }

    public void setResult(Place result) {
        this.result = result;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PlaceAPIProvider getProvider() {
        return provider;
    }

    public void setProvider(PlaceAPIProvider provider) {
        this.provider = provider;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Status: " + status + "\n");
        if (null != html_attributions) {
            sb.append("Attributions:\n");
            for (String attr: html_attributions) {
                sb.append("  " + attr + "\n");
            }
        }
        if (null != result) {
            sb.append("Places:\n");
           /* for (Place place: result) {
                sb.append(place.toString() + "\n");
            }*/
        }
        return sb.toString();
    }
}
