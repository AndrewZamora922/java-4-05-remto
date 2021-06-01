package com.company;


import java.awt.print.Book;
import java.util.*;

public class Books {
    String libraryAddress;
    ArrayList<Book> books;
    String title;
    boolean borrowed;

    // Creates a new Book
    public Book(String bookTitle) {
        // Implement this method
    }

    // Marks the book as rented
    public void borrowed() {
        // Implement this method
    }

    // Marks the book as not rented
    public void returned() {
        // Implement this method
    }

    // Returns true if the book is rented, false otherwise
    public boolean isBorrowed() {
        // Implement this method
    }

    // Returns the title of the book
    public String getTitle() {
        // Implement this method
    }

    public static void main(String[] arguments) {
        // Small test of the Book class
        Book example = new Book("The Da Vinci Code");
        System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
        example.rented();
        System.out.println("Borrowed? (should be true): " + example.isBorrowed());
        example.returned();
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
    }


//
//
//    public Library(String address)
//    {
//        libraryAddress = address;
//        books = new ArrayList<Book>();
//    }
//
//    public void addBook(Book book)
//    {
//        books.add(book);
//    }
//
//    public void printAddress()
//    {
//        System.out.println(libraryAddress);
//    }
//
//    // This method checks the books ArrayList to see if the book with the title exists.
//    // if it does and it's not borrowed, it borrows it and alerts the user they've successfully checked it out.
//    // If it does exists and its borrowed, it alerts the user that the book is already borrowed.
//    // If the book does not exist in the library, the user is alerted.
//    // My reason for making the return type of this method not void is so that I could immediately exit the method
//    // if the book was found in the library. The fact that it's a String is arbitrary; it could have been any data type
//    // since I return null for any case.
//    public String borrowBook(String bookTitle)
//    {
//        Book libraryBook;
//        String libraryBookTitle;
//
//        for(int i = 0; i < books.size(); i+=1)
//        {
//            libraryBook = books.get(i);
//            libraryBookTitle = libraryBook.getTitle();
//
//            if(libraryBookTitle.equals(bookTitle))
//            {
//                if(!(libraryBook.isBorrowed()))
//                {
//                    libraryBook.borrowed();
//                    System.out.println("You successfully borrowed " + libraryBookTitle);
//                    return null;
//                }
//                else
//                {
//                    System.out.println("Sorry, this book is already borrowed.");
//                    return null;
//                }
//            }
//        }
//
//        System.out.println("Sorry, this book is not in our catalog.");
//        return null;
//    }
//
//    // This method walks through the books ArrayList and prints the title
//    // of any book object that is not borrowed. If the library is empty or
//    // all of the books are checked out, it will alert the user.
//    public void printAvailableBooks()
//    {
//        Book libraryBook;
//        boolean libraryIsEmpty = true;
//
//        for(int i = 0; i < books.size(); i+=1)
//        {
//            libraryBook = books.get(i);
//
//            if(!(libraryBook.isBorrowed()))
//            {
//                System.out.println(libraryBook.getTitle());
//                libraryIsEmpty = false;
//            }
//        }
//
//        if(libraryIsEmpty)
//        {
//            System.out.println("No books in catalog.");
//        }
//    }
//
//    // This method walks through the books ArrayList, searching for the input bookTitle.
//    // When found, the book object will be returned and the user will be notified. If the
//    // book is not found in the library, the user will be alerted.
//    public void returnBook(String bookTitle)
//    {
//        Book libraryBook;
//        String libraryBookTitle;
//        Boolean found = false;
//
//        for(int i = 0; i < books.size(); i+=1)
//        {
//            libraryBook = books.get(i);
//            libraryBookTitle = libraryBook.getTitle();
//
//            if(libraryBookTitle.equals(bookTitle))
//            {
//                if(libraryBook.isBorrowed())
//                {
//                    libraryBook.returned();
//                    System.out.println("You successfully returned " + libraryBookTitle);
//                    found = true;
//                    break;
//                }
//            }
//        }
//
//        if(!found)
//        {
//            System.out.println("Your book was not fond in the library catalog.");
//        }
//    }
//
//    public static void printOpeningHours()
//    {
//        System.out.println("Libraries are open daily from 9am to 5pm.");
//    }

}
