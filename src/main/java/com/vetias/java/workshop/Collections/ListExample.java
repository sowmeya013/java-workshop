package com.vetias.java.workshop.Collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("sowmeya");
        names.add("arthi");
        names.add("mitra");
        names.add("karthika");
        System.out.println(names);
        names.set(1,"santhosh");
        for(int i=0;i<names.size();i++){
            System.out.println(names.get(i));
            names.sort(Comparator.naturalOrder());
        }

        }

}
