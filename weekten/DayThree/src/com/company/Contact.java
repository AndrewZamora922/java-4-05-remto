package com.company;

public class Contact {

    private String name; // Stores name of Contact
    private int address;  // Stores address of Contact
    private int phonenumber; // Stores phone number of contact
    private String email;  // Stores contacts email

    // Creates Contact object based on parameters.
    public Contact(String n, int a, int p, String e) {
        name = n;
        address = a;
        phonenumber = p;
        email = e;
    }


    // Changes phone number of contact
    public void changeNumber(int newnum) {
        phonenumber = newnum;
    }

    // Implements the passing of Contact's address.
    public void Address() {
        address++;
    }

    // Returns the name of a Contact
    public String getName() {
        return name;
    }

    // Returns the age of a Contact
    public int getAddress() {
        return address;
    }

    // Returns the phone number of a Contact
    public int getNumber() {
        return phonenumber;
    }

    // Returns email of Contact
    public String getEmail() {
        return email;
    }


    // Prints all information about a contact out.
    public String toString() {
        return "Name: " + name + " Address: " + address + " Phone#: " + phonenumber +
                " Email: " + email;
    }
}



