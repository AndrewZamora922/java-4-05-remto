package com.company;

public class AsciiChars {
    public static void printNumbers(){
        System.out.println("printNumbers : " + number);
    }

    public static void printLowerCase(){
        System.out.println("printLowerCase : " + lower);
    }

    public static void printUpperCase(){
        System.out.println("printUpperCase : " + upper);
    }


    String str = "#GeeKs01fOr@gEEks07";
    int upper = 0, lower = 0, number = 0, special = 0;

    for(int i = 0; i < str.length(); i++) {

        char ch = str.charAt(i);
        if (ch >= 'A' && ch <= 'Z') {
            upper++;
        } else if (ch >= 'a' && ch <= 'z') {
            lower++;
        } else if (ch >= '0' && ch <= '9') {
            number++;
        } else {
            special++;
        }
    }





}
