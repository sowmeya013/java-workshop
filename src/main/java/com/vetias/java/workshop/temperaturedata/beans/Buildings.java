package com.vetias.java.workshop.temperaturedata.beans;
import java.time.LocalDateTime;

public class Buildings {
    private String name;
    private double area;
    private int floors;
    public LocalDateTime OpeningHours;
    public LocalDateTime ClosingHours;
    
    public void Building(String name, double area, int floors, LocalDateTime openingHours, LocalDateTime closingHours) {
        this.name = name;
        this.area = area;
        this.floors = floors;
        this.OpeningHours = openingHours;
        this.ClosingHours = closingHours;
    }
    public String getName() {
        return name;
    }
    public double getArea() {
        return area;
    }
    public int getFloors() {
        return floors;
    }
    public LocalDateTime getOpeningHours() {
        return getClosingHours();
    }
    public LocalDateTime getClosingHours() {
        return getOpeningHours();
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public void setFloors(int floors) {
        this.floors = floors;
    }
    public void setOpeningHours(LocalDateTime openingHours) {
        this.OpeningHours = openingHours;
    }
    public void setClosingHours(LocalDateTime closingHours) {
        this.ClosingHours = closingHours;
    }

    public void PrintDetails() {
        System.out.println("Building Name: " + name);
        System.out.println("Area: " + area + " sq.m");
        System.out.println("Number of Floors: " + floors);
        System.out.println("Opening Hours: " + OpeningHours);
        System.out.println("Closing Hours: " + ClosingHours);
    }
}
