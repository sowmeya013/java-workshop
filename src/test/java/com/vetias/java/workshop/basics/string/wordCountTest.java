package com.vetias.java.workshop.basics.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class wordCountTest {
    @Test
    public void testWordCount() {
        WordCount wordCount =new WordCount();
        int  count =wordCount.count("this is a java program");
        Assertions.assertEquals(5,count);
        
    }




    @Test
    public void testAnotherString() {
        WordCount wordCount =new WordCount();
        int  count =wordCount.count("this is a java program coding in java full stack developement coding");
        Assertions.assertEquals(12,count);
    }
}  