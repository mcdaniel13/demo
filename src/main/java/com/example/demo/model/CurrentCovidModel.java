package com.example.demo.model;

import java.util.List;

public class CurrentCovidModel {
    List<CovidStatus> covidStatus;

    public List<CovidStatus> getCovidStatus() {
        return covidStatus;
    }

    public void setCovidStatus(List<CovidStatus> mCovidStatus) {
        this.covidStatus = mCovidStatus;
    }

    public static class CovidStatus {
        private String Lat;
        private String Lon;
        private String Cases;
        private String Status;
        private String Date;

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

        public String getLat() {
            return Lat;
        }

        public void setLat(String lat) {
            Lat = lat;
        }
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