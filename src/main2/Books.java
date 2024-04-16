/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main2;

/**
 *
 * @author muhan
 */
public class Books extends Publications{
    boolean bookBorrowed ;
    private String nameAuthor;   
    private String numberOfPages;
    public Books() {
    }
       
    public Books(String nameAuthor, String numberOfPages, String publicationTittle, String publicationYear ) {
    super( publicationTittle,publicationYear );
        this.nameAuthor = nameAuthor;       
        this.numberOfPages = numberOfPages;
                }

    public boolean isBookBorrowed() {
        return bookBorrowed;
    }
    public String getNameAuthor() {
        return nameAuthor;
    }
    public String getNumberOfPages() {     
        return numberOfPages;
    }
    public String getPublicationTittle() {     
        return publicationTittle;
    }
    public String getPublicationYear() {
        return publicationYear;    
 }
     public  int getPublicationId() {
        return publicationId;
    }
             
    
}