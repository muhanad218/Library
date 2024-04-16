/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main2;

public abstract  class Publications {        
    protected String publicationTittle;    
    protected String publicationYear;
    boolean bookBorrowed = false;
    int Id=1;
    static int publicationId=1;
    
    public Publications() {
     }
             public Publications( String publicationTittle, String publicationYear) {
        
       this.publicationTittle = publicationTittle;
       this.publicationYear = publicationYear;
       publicationId=Id;
       Id++;
             }

    public String getPublicationTittle() {
        return publicationTittle;
    }

    public String getPublicationYear() {
        return publicationYear;
    }

    public boolean isBookBorrowed() {
        return bookBorrowed;
    }

    public  int getPublicationId() {
        return publicationId;
    }
             
}