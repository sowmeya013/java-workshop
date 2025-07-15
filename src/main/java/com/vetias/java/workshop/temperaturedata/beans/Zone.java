package com.vetias.java.workshop.temperaturedata.beans;

public class Zone {
    private String name;
    private String ZoneId;
    private String type;
    private double area;


public Zone(String name, String zoneID, String type, double area) {
        this.name = name;
        this.ZoneId = zoneID;
        this.type = type;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public String getZoneID() {
        return ZoneId;
    }

    public String getType() {
        return type;
    }

    public double getArea() {
        return area;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setZoneID(String zoneID) {
        this.ZoneId = zoneID;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setArea(double area) {
        this.area = area;
    }

   

}