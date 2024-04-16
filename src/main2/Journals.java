/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main2;

/**
 *
 * @author muhan
 */

    public class Journals extends Publications  { 
    public  String journalsTybe;  
    public Journals() {
    
    }
    public String getJournalsTybe() {
        return journalsTybe;    }
    
   public Journals(String journalsTybe, String publicationTittle, String publicationYear ) {     
       super(publicationTittle, publicationYear );
        this.journalsTybe = journalsTybe;       
   }
    public String getPublicationTittle() {       
        return publicationTittle;
    }
    public String getPublicationYear() {      
        return publicationYear;
    }   
 
    
    
}
    


    

