package com.arcu.ignite1;

import com.google.android.gms.maps.model.LatLng;

public class Location {

    public Double latitude;
    public Double longitude;
    public String title;
    public String snippet;

    public Location() {
    }

    public Location(double latitude, double longitude, String title, String snippet) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.title = title;
        this.snippet = snippet;
    }

    public double getLatitude() {
        if (latitude != null) {
            return latitude;
        }
        return 0.0;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {

        if (longitude != null) {
            return longitude;
        }

        return 0.0;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getTitle() {

        if (title != null) {
            return title;
        }

        return "No Title Set";
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSnippet() {
        if (snippet != null) {
            return snippet;
        }
        return "No SNippet Set";
    }

    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }
}
