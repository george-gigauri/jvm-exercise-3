package com.example.exercise.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Covid {

    private String country;
    private int confirmed;
    private int recovered;
    private int deaths;

    public Covid(String country, int confirmed, int recovered, int deaths) {
        this.country = country;
        this.confirmed = confirmed;
        this.recovered = recovered;
        this.deaths = deaths;
    }

    public Covid() {}

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(int confirmed) {
        this.confirmed = confirmed;
    }

    public int getRecovered() {
        return recovered;
    }

    public void setRecovered(int recovered) {
        this.recovered = recovered;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }
}
