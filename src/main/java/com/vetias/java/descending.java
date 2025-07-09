package main.Java.com.vetias.java;

import java.util.Arrays;

import java.util.Collections;

public class descending {
    public static void main(String[]args){
        Double[]prices ={30.45,67.89,46.65,89.90,78.45};
        Arrays.sort(prices,Collections.reverseOrder());
        System.out.println("list in descending order");
        for(Double price:prices)
        {
            System.out.println(price);
        }
    }
}
