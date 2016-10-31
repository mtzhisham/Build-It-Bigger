package com.example;

import java.util.Random;

public class MyJJokes {


    String[] jokes = {"wubba lubba dub dub",
            "Some people just have a way with words, and other people … oh … not have way."
            ,"A conference call is the best way for a dozen people to say “bye” 300 times."
            ,"If at first you didn’t succeed, Call it version 1.0."
            ,"Hey! It compiles! Ship it!"
    };


    private String getRandom(){
        Random random = new Random();
        int n = random.nextInt(jokes.length);
        return  jokes[n];
    }

    public String getJoke(){
        return getRandom();
    }
}
