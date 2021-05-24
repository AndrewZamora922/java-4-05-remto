package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static <n> void main(String[] args) {
//        Scanner userInput = new Scanner(System.in);
//        int num = new ArrayList<>();

//        int n,sum=0;
//
//        System.out.println("Enter 5 numbers: ");
//         n = userInput.nextInt();
//         int a[]= new int[n];
//
//        System.out.println("Your numbers are " + n);
//
//        for(int i = 0; i < n; i++){
//            num += a[i];
//            System.out.println("sum of " + n + " numbers is = " + sum);
//        }


        int n,sum=0;

        Scanner sc=new Scanner(System.in);

        System.out.println("enter how many numbers you want ");
        n = sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the numbers ");

        for(int i=0;i<n;i++)
        {
            System.out.println("enter  number  "+(i+1)+" ");
            a[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            sum+=a[i];
        }
        System.out.println("sum of the "+n+" numbers is = "+sum);

        for(int i=0;i<n;i++)
        {
            sum*=a[i];
        }
        System.out.println("product is "+ sum);



        int min,max;
//        int n=scan.nextInt();
//        int a[]=new int[n];

        for(int i=0; i<n; i++){
        }
        min=a[0];
        max=a[0];

        for(int i=0; i<n; i++){
            if(min>a[i]){
                min=a[i];
            }
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println("\nThe smallest value is: "+min);
        System.out.println("\nThe largest value is: "+max);


        System.out.println();


        HashMap<String, Integer> vehicles = new HashMap<>();


            vehicles.put("Honda", 8);
            vehicles.put("Ford", 2);
            vehicles.put("Dodge", 6);
            vehicles.put("Chevy", 4);
            vehicles.put("BMW", 1);
            vehicles.put("Audi", 3);
            vehicles.put("Subaru", 2);

        System.out.println("Total vehicles: " + vehicles.size());

        // Iterate over all vehicles, using the keySet method.
        for (String key : vehicles.keySet())
            System.out.println(key + " - " + vehicles.get(key));
        System.out.println();

        System.out.println("Oh, you're looking for a Civic? Our Honda selection is right over here!");

        String searchKey = "Honda";
        if (vehicles.containsKey(searchKey))
            System.out.println("Found total " + vehicles.get(searchKey) + " " + searchKey + " cars!\n");

        }
    }








