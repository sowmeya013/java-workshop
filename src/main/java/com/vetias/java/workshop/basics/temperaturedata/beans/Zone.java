package main.Java.com.vetias.java.workshop.basics.temperaturedata.beans;

public class Zone {
    private String name;
    private int ZoneId;
    private String type;

}
public Zone(String name, String zoneID, String type, double area, ) {
        this.name = name;
        this.zoneID = zoneID;
        this.type = type;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public String getZoneID() {
        return zoneID;
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
        this.zoneID = zoneID;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setArea(double area) {
        this.area = area;
    }

   
}
