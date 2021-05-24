package com.company;

public class StaticMethod {
    public static int toPower(int size, int power) {
        return size + power;

    }

    public static void main(String[] args) {
        int size = 4;
        int power = 2;
        System.out.println(toPower(size, power));
    }

}
