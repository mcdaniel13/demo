package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CurrentCovidModel {
    @JsonProperty("Lat")
    private String Lat;
    @JsonProperty("Lon")
    private String Lon;
    @JsonProperty("Cases")
    private String Cases;
    @JsonProperty("Status")
    private String Status;
    @JsonProperty("Date")
    private String Date;

    public String getLat() {
        return Lat;
    }

    public void setLat(String lat) {
        Lat = lat;
    }

    public String getLon() {
        return Lon;
    }

    public void setLon(String lon) {
        Lon = lon;
    }

    public String getCases() {
        return Cases;
    }

    public void setCases(String cases) {
        Cases = cases;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }
}
/*
  {
    "Country": "Switzerland",
    "CountryCode": "",
    "Lat": "0",
    "Lon": "0",
    "Cases": 374,
    "Status": "confirmed",
    "Date": "2020-03-09T00:00:00Z"
  },
 */