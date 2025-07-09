package main.Java.com.vetias.java.workshop.basics;

public class strings {
    public static void main(String[]args){
        String text ="this program show how can we spilt a "+"string into multiple string.we need to find sentence,";
        String[] sentence = text.split(" //.");
        String[] words = text.split(" ");
        System.out.println(sentence.length);
        System.out.println(words.length);
        System.out.println(text.length());
    }
}
