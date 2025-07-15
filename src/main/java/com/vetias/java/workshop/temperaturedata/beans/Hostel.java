package com.vetias.java.workshop.temperaturedata.beans;

public class Hostel extends Buildings {
    private boolean isMessAvailable;
    private int numberOfRomms;

    public Hostel(int numberOfRooms, boolean isMessAvailable) {
        this.numberOfRomms = numberOfRooms;
        this.isMessAvailable = isMessAvailable;
    }

    public int getNumberOfRooms() {
        return numberOfRomms;
    }

    public boolean isMessAvailable() {
        return isMessAvailable;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRomms = numberOfRooms;
    }

    public void setMessAvailable(boolean messAvailable) {
        isMessAvailable = messAvailable;
    }

    public void displayHostelInfo() {
        super.PrintDetails();
        System.out.println("Number of Rooms: " + numberOfRomms);
        System.out.println("Is Mess Available: " + (isMessAvailable ? "Yes" : "No"));
    }
}