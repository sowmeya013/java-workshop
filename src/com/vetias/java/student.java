package com.vetias.java;

public class student {
    public static void main(String[]args){
        String[] [] students =
    {
        {"01","sowme"},{"02","arthi"},{"03","mitra"},{"04","karthi"}

    };
    System.out.println("roll number and name");
    for(int i=0;i<students.length;i++)
    {
        System.out.println("%s%n%s%n",students[i][0],students[i][i]);

    }
    }
    
}
