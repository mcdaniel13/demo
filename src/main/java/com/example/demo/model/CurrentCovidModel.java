package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CurrentCovidModel {
    @JsonProperty("Lat")
    private String mLat;
    @JsonProperty("Lon")
    private String mLon;
    @JsonProperty("Confirmed")
    private String mConfirmed;
    @JsonProperty("Deaths")
    private String mDeaths;
    @JsonProperty("Recovered")
    private String mRecovered;
    @JsonProperty("Active")
    private String mActive;
    @JsonProperty("Date")
    private String mDate;

    public String getmLat() {
        return mLat;
    }

    public void setmLat(String mLat) {
        this.mLat = mLat;
    }

    public String getmLon() {
        return mLon;
    }

    public void setmLon(String mLon) {
        this.mLon = mLon;
    }

    public String getmConfirmed() {
        return mConfirmed;
    }

    public void setmConfirmed(String mConfirmed) {
        this.mConfirmed = mConfirmed;
    }

    public String getmDeaths() {
        return mDeaths;
    }

    public void setmDeaths(String mDeaths) {
        this.mDeaths = mDeaths;
    }

    public String getmRecovered() {
        return mRecovered;
    }

    public void setmRecovered(String mRecovered) {
        this.mRecovered = mRecovered;
    }

    public String getmActive() {
        return mActive;
    }

    public void setmActive(String mActive) {
        this.mActive = mActive;
    }

    public String getmDate() {
        return mDate;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate;
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