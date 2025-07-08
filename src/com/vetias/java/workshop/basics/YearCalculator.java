package com.vetias.java.workshop.basics;
import java.util.Scanner;
import java.time.LocalDate;
public class YearCalculator {
    public static void main(String[] args) {
        Scanner inputScanner =new Scanner(System.in);{
        System.out.println("enter the year(YYYY-MM-DD):");
        String dateOfBirth=inputScanner.nextLine();
        LocalDate birthDate=LocalDate.parse(dateOfBirth);;
        int  YearOfBirth =birthDate.getYear();
        int currentYear=LocalDate.now().getYear();
        int age=currentYear-YearOfBirth;
        System.out.println(age);
    }

    }

}
