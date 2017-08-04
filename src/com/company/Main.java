package com.company;

public class Main {

    public static int getWordVal(String word){
        int wordVal = 0;
        for(int i=0; i<word.length(); i++){
            wordVal += (int)word.charAt(i);
        }
        return wordVal;
    }

    public static int rateName(String name){
        double rawValue = getWordVal(name);
        if(name.length() > 5){
            rawValue = rawValue*.5;
        }
        if(name.length() > 7){
            rawValue = rawValue*.6;
        }
        if(name.length()%2 != 0){
            rawValue = rawValue/2;
        }
        return (int)rawValue;
    }

    public static String verboseRating(int score){
        if(score < 100){
            return "Oh my, I hate to say it, your name is very poor";
        } else if(score < 200){
            return "Not bad, just doesn't really play to my personal tastes";
        } else if(score < 300){
            return "Ahh, that is a perfectly average name";
        } else if(score < 400){
            return "That name is quite good, I like it a lot";
        } else {
          return "Oh wow, that name is Amazing!";
        }
    }

    public static void main(String[] args) {

        System.out.println(verboseRating(rateName("Timothy")));
        System.out.println(verboseRating(rateName("Tim")));
        System.out.println(verboseRating(rateName("lela")));
        System.out.println(verboseRating(rateName("Lela")));
        System.out.println(verboseRating(rateName("georgei")));
        System.out.println(verboseRating(rateName("ji")));
        System.out.println(verboseRating(rateName("Timothy!")));
    }
}
