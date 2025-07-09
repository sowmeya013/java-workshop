package main.Java.com.vetias.java.workshop.basics.temperaturedata.beans;

public class Hostel extends Buildings {
    private boolean isMessAvailable;
    private int numberOfRomms;

}
    public Hostel(int numberOfRooms, boolean isMessAvailable) {
        this.numberOfRooms = numberOfRooms;
        this.isMessAvailable = isMessAvailable;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public boolean isMessAvailable() {
        return isMessAvailable;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public void setMessAvailable(boolean messAvailable) {
        isMessAvailable = messAvailable;
    }

    public void displayHostelInfo() {
        super.PrintDetails();
        System.out.println("Number of Rooms: " + numberOfRooms);
        System.out.println("Is Mess Available: " + (isMessAvailable ? "Yes" : "No"));
    }
}
