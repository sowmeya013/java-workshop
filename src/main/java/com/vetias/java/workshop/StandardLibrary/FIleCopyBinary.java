package com.vetias.java.workshop.StandardLibrary;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class FIleCopyBinary {
    public static void main(String[] args){
        try (FileInputStream inputStream=new FileInputStream("sowme.jpeg");
        FileOutputStream outputStream=new FileOutputStream("santhosh.jpeg"))
        {
         byte[] chunk=new byte[2024];
         int byteRead;
         while ((byteRead=inputStream.read(chunk))!=-1){
            outputStream.write(chunk,0,byteRead);

         }   
    }catch(IOException e){
        System.out.println("error in the folder");

    }
    }

}
