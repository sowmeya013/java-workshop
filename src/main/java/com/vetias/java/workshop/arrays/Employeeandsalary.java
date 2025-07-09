package main.Java.com.vetias.java.workshop.arrays;

import java.util.Arrays;

public class Employeeandsalary {
    public static void main(String[]args){
        String[][] employees = new String[5][2];
        employees[0][0]="sowmeya012";
        employees[0][1]="35,000";
        employees[1][0]="karthi34";
        employees[1][1]="40,000";
        employees[2][0]="arthi";
        employees[2][1]="50,000";
        employees[3][0]="mitra";
        employees[3][1]="60,000";
        employees[4][0]="kaviya";
        employees[4][1]="70,000";
       for (String[]employee:employees) {
        System.out.println(Arrays.toString(employee));

       } 
         

        }

}
