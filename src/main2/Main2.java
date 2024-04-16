/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main2;

import java.util.Scanner;

/**
 *
 * @author muhan
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Library library = new Library();
    Borrower borrower= new Borrower();
    String Journal = "Journal";
    String Book ="Book";
    Scanner scanner = new Scanner(System.in);
    boolean flag = true;                     //**************************
    System.out.println("choose <Book> or <Journal> : ");   
    String enter = scanner.nextLine();
    
    if(enter.equals(Book) ){
       int choice;

    do {           
        System.out.println("select option :");
        System.out.println("1. Add book");     
        System.out.println("2. Remove book ");
        System.out.println("3. Display books ");
        System.out.println("4. Add Customer ");
        System.out.println("5. borrow book");
        System.out.println("6. Exit");
        choice = scanner.nextInt();
        switch (choice) {
         
            case 1:                  
                System.out.println("  Enter the title of the book:");
                String publicationTittle = scanner.nextLine();
                
                System.out.println(publicationTittle);
                scanner.reset();
                System.out.println(" Enter author name :");   
                
                String nameAuthor = scanner.nextLine();
                System.out.println(nameAuthor);
                
                System.out.println("Enter the number of pages : ");
                String numberOfPages = scanner.next();
                
                System.out.println(" Year of publication :");
                String publicationYear = scanner.next();           
                Books book = new Books( nameAuthor,  numberOfPages,  publicationTittle, publicationYear);
                library.addBook(book);  
                break;
                case 2:
                System.out.println("Enter the book title that you want to remove : ");
                String title = scanner.nextLine(); 
                library.removeBook(title);
                break;               
                case 3:
                library.displayBooks();
                break;
                case 4:
                    System.out.println("Enter the first name :");
                    String firstName= scanner.next();
                    System.out.println("Enter the last name:");
                    String lastName = scanner.next();
                    System.out.println("Enter the phone number:");
                    String phoneNumber = scanner.next();
                    scanner.nextLine();
                    Borrower b = new Borrower(firstName , lastName, phoneNumber);
                    library.AddCustomer(b);
                     
                case 5:
                  /*  System.out.println("Enter the book ID :");
                    Books bo= new Books();
                    bo.g
                    Borrower w= new Borrower();
                    w.BorrowerBasket(BookName);
                    */
                    
                    break;
                case 6:
                System.out.println("See you next time.");
                break;
                default:
                System.out.println(" This choice is not available .");        
                break;
             }
        } while (choice != 6);
    }
    else{
    if(enter.equals(Journal)){    
    int option;
    do {     
        System.out.println("choose option:");         
        System.out.println("1. Add Scientific papers : ");
        System.out.println("2. Remove Scientific paper :");
        System.out.println("3.Add news paper : ");
        System.out.println("4.Remove news paper : ");      
        System.out.println("5.Add magazine :");
        System.out.println("6.Remove magazine: ");       
        System.out.println("7. Display publications :   ");
        System.out.println("8.Exit.");       
        option = scanner.nextInt();
    switch(option){          
        case 1:
            System.out.println(" Journal type :");     
            String a0 = scanner.nextLine();
            System.out.println(" Journal title :");     
            String b0 = scanner.nextLine();
            System.out.println("Year of publication : ");          
            String c0 = scanner.nextLine();
            Journals journal0 =new Journals( a0,  b0,  c0);
            break;
        case 2:             
            System.out.println(" Select the Publication that you want to remove :  ");
            String tittle0 = scanner.nextLine();        
            library.removjournal(tittle0);
            break;     
        case 3:
            System.out.println(" Publication type :");           
            String a1 = scanner.nextLine();
            System.out.println(" Publication location :");      
            String b1 = scanner.nextLine();
            System.out.println("Publication year : ");           
            String c1 = scanner.nextLine();
            Journals journal1 =new Journals( a1,  b1,  c1);       
            break;        
        case 4:
            System.out.println(" Enter the journal that you want to remove :");    
            String tittle1 = scanner.nextLine();
            library.removjournal(tittle1);
             break;           
        case 5:
             System.out.println("Journal type : ");         
             String a2 = scanner.nextLine();
             System.out.println("Journal location : ");        
             String b2 = scanner.nextLine();
             System.out.println(" Journal location : ");           
             String c2 = scanner.nextLine();
             Journals journal2 =new Journals( a2,  b2,  c2);  
             break;
        case 6:    
             System.out.println("Enter the journal that you want to remove :   ");
             String tittle2 = scanner.nextLine();  
             library.removjournal(tittle2);
             break;
        case 7:   
            library.displayjournal();
            break;        
        case 8:
             System.out.println("See you next time >_<  "); 
             break;
        default:         
             System.out.println(" This option is not availbe..");
              break;      
      }       
      }while(option != 8);      
      }
    else{System.out.println("This Journal is not availbe ...   ");}
       }
    }
}
 