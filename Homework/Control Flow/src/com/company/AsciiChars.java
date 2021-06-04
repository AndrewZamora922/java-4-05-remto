package com.company;

public class AsciiChars {
    public static void printNumbers(){

        char number = '1';
        int asciiChars = number;

        for(int i = 0; i <= 255; i++)

        System.out.println("printNumbers : " + asciiChars);
    }

    public static void printLowerCase(){

        char lower = 'a';
        int asciiChars = lower;

        for(int i = 97; i <= 122; i++)
        System.out.println("printLowerCase : " + asciiChars);
    }

    public static void printUpperCase(){

        char upper = 'A';
        int asciiChars = upper;

        for(int i = 65; i <= 90; i++)
        System.out.println("printUpperCase : " + asciiChars);
    }


 }






