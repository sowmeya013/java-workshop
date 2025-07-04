package com.vetias.java.workshop.basics.temperaturedata;

public class Location {
    private String name;
    private double latitude;
    private double longitude;
    private String description;
    private String country;
    private String city;
    private String address;
    private String postalcode;

    private void setname(String aName) {
        name= aName;
    }
    public String getName() {
        return name;
    }
 public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getAddress() {
        return address;
    }

    public String getPostalCode() {
        return postalcode;
    }

    public String getcountry() {
        return country;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPostalCode(String postalCode) {
        this.postalcode = postalCode;
    }
    public void setContact(String country) {
        this.country = country;
    }

    @Override
    public String toString() {      
        return "Location{" +
                "name='" + name + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", address='" + address + '\'' +
                ", postalCode='" + postalcode + '\'' +
                ", contact='" + country + '\'' +
                '}';
    }
}
 

