package com.vetias.java.workshop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CharacterReader {
    public static void main (String[] args) {
        try (BufferedReader reader=new BufferedReader(new FileReader("README.md"))){
        
            String line;
            while((line=reader.readLine())!=null){
                
                    System.out.println(line);

                }
}catch(IOException e){
    System.out.println("error dection");
    e.printStackTrace();
}
        }
        
    }

