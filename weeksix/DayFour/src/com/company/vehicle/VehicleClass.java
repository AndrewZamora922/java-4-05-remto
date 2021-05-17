package com.company.vehicle.;

public class VehicleClass {

    public String Color;
    public int numberOfDoors;
// no-args constructor
    public VehicleClass(){
        color = "blue";
        numberOfDoors = 3;
    }

    // constructor with arguments or all args constructor
    public VehicleClass (String color, int numberOfDoors){
        this.color = color;
        this.numberOfDoors = numberOfDoors;
    }


    // single argument constructor
    public VehicleClass (String color){
        this.color = color;
        this.numberOfDoors = numberOfDoors;
    }

    public void start(){
        System.out.println("Car is Starting");
    }

    public void stop(){
        System.out.println("Car is drifting");
    }
    public void drive(){
        System.out.println("Car is racing");
    }
}