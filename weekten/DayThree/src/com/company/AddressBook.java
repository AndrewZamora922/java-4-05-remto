package com.company;

import java.util.*;


    public class AddressBook {
        private ArrayList<Contact> contact; // An array of Contacts

        // Create an empty AddressBook
        public AddressBook() {
            contact = new ArrayList<Contact>();
        }

        // Add a contact that's passed in as a parameter.
        public void addContact(Contact c) {
            contact.add(c);
        }

        // Print out info on all contacts using method Contact class.
        public void printContacts() {
            for (int i = 0; i < contact.size(); i++)
                System.out.println(contact.get(i));
        }

        // Returns the number of contacts currently in AddressBook
        public int numContacts() {
            return contact.size();
        }

        // Returns a non-neg integer if a Contact with name s exists corresponding
        // to which place in the array Contact is stored. Returns -1
        // otherwise.
        private int haveContact(String s) {
            for (int i = 0; i < contact.size(); i++)
                if (contact.get(i).getName().equals(s))
                    return i;
            return -1;
        }
        private int haveContact1(String e) {
            for (int i = 0; i < contact.size(); i++)
                if (contact.get(i).getEmail().equals(e))
                    return i;
            return -1;
        }

        // Deletes a contact with name s, if one is in the AddressBook.
        public void deleteContact(String s) {
            int place = haveContact(s);
            if (place >= 0)
                contact.remove(place);
        }
}