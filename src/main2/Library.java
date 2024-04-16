/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author muhan
 */
import java.util.Scanner;

public class Library extends Books { 
     private List<Books> books; 
     private List<Journals> journals; 
     protected List<Borrower> borrower;

    public Library() { 
        books = new  ArrayList<>(); 
        journals = new  ArrayList<>();  
        borrower = new ArrayList<>();
        

    }
    public void AddCustomer(Borrower b) {
        // 
        if (!Borrower.isRegistered(b, borrower)) {
            borrower.add(b);
        }
    }
    
    public void addBook(Books book) { 
        books.add(book); 
        System.out.println(" The book has been added successfully ."); 
    } 
 
    public void removeBook(String title) { 
        Books bookToRemove = null; 
        for (Books book : books) { 
            if (book.getPublicationTittle().equals(title)) { 
                bookToRemove = book; 
                break; 
                
            } 
        } 
        if (bookToRemove != null) { 
            books.remove(bookToRemove); 
            System.out.println("The book has been removed successfully ."); 
        } else { 
            System.out.println("This book is not availbe ."); 
        } 
    } 
 
    public void displayBooks() { 
        if (books.isEmpty()) { 
            System.out.println("there is no books in the library ."); 
        } else { 
            System.out.println("Book list: ");
            for (Books book : books) { 
                System.out.println("Book title : " + book.getPublicationTittle() ); 
                System.out.println( " Author name : " + book.getNameAuthor() );
                System.out.println( " Publication year :" + book.getPublicationYear() );
                System.out.println("Number of pages :" + book.getNumberOfPages());
                System.out.println("ID: "+book.getPublicationId());
                System.out.println();
            } 
        } 
    } 

    
    public void borrowbook(String title)
    {
        for (int i = 0; i < books.size(); i++) {
            
        }
    }
    public void addjournal(Journals journal ){ 
        journals.add(journal); 
        System.out.println("The journal has been added successfully...    "); 
    }     
    public void removjournal(String tittle){ 
          Journals journalToRemove = null; 
        for (Journals journal  : journals) { 
            if (journal.getPublicationTittle().equals(tittle)) { 
                journalToRemove = journal; 
                break; 
            } 
        } 
        if (journalToRemove != null) { 
            books.remove(journalToRemove); 
            System.out.println("The book has been removed successfully ."); 
        } else { 
            System.out.println("The book is not available ."); 
        } 
    } 
     public void displayjournal(){ 
         if (journals.isEmpty()) { 
            System.out.println("There is no books recently."); 
        } else { 
            System.out.println("List of books in Library :"); 
            for (Journals journal : journals) { 
                System.out.println(" Book location: " + journal.getPublicationTittle() + " Year of publication :" + journal.getPublicationYear() ); 
            } 
            } 
     } 


    


     
 }

