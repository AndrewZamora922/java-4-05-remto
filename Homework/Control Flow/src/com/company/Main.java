package com.company;

import com.company.AsciiChars;
import com.company.HelloWorld;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World");

        AsciiChars.printNumbers();
        AsciiChars.printLowerCase();
        AsciiChars.printUpperCase();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");     // type a word and hit enter
        String someString = scanner.next();
        System.out.println("Hello " + someString);

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Would you like to continue to the interactive  portion: ");
        String someString1 = scanner1.next();

        }
    }

