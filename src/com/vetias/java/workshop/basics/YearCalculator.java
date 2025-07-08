package com.vetias.java.workshop.basics;
import java.util.Scanner;
import java.time.LocalDate;
public class YearCalculator {
    public static void main(String[] args) {
        Scanner inputScanner =new Scanner(System.in);
        System.out.println("enter the year(only year):");
        int year=inputScanner.nextInt();
        int currentyear=LocalDate.now().getYear();
        int age=currentyear-year;
        System.out.println(age);

    }

}
