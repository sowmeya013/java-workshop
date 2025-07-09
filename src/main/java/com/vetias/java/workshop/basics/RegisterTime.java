package main.Java.com.vetias.java.workshop.basics;

import java.time.LocalTime;

public class RegisterTime {
    public static void main(String[]args) {
        LocalTime currentTime=LocalTime.now();
        LocalTime registrationEndTime=LocalTime .of(18,59,59);
        int hoursleft= registrationEndTime.getHour()-currentTime.getHour();
        int minutesleft=registrationEndTime.getMinute()-currentTime.getHour();
        int secondleft=registrationEndTime.getSecond()-currentTime.getHour();


        System.out.println("you have "+hoursleft+"hours,"
                           +minutesleft +"minutes,+and"
                           +secondleft+"second left to register.");
    }

}
