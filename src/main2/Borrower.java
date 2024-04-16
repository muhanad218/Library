/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author muhan
 */
public class Borrower extends Library {
    protected String FirstName;
    protected String LastName;
    protected String PhoneNUM;
    
    Books b[] = new Books[3];
    Journals j[]= new Journals[3];
    public Borrower() {
        borrower = new ArrayList<>();
     
    }

    public Borrower(String FirstName, String LastName, String PhoneNUM) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.PhoneNUM = PhoneNUM;
        
    }
    
    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getPhoneNUM() {
        return PhoneNUM;
    }
    public static boolean isRegistered(Borrower b, List<Borrower> borrowers){
       for(Borrower borrower : borrowers) {
           if (borrower.getPhoneNUM().equals(b.getPhoneNUM())) {
               System.out.println("is registered");
               return true;
           }
       }
       return false;
    }
   
      
   
   
   
   
   public void BorrowerBasket(Publications p)
    {
        if(Ismax()){
            System.out.println("The basket is full...");
            return;
        }
        if(p instanceof Books){
            for (int i = 0; i < b.length; i++) {
                if(b[i]==null){
                    b[i]= (Books)p;
                    return;
                }
            }
  
        }
        if(p instanceof Journals){
            for (int i = 0; i < j.length; i++) {
                if(j[i]==null){
                    j[i]= (Journals)p;
                }
            }
        }
    }
    public boolean  Ismax(){
        int counter =0;
        
        for (int i = 0; i < b.length; i++) {
            if(b[i]!=null){
                counter++;
            }
        }
        for (int i = 0; i < j.length; i++) {
            if(j[i]!= null){
                counter++;
            }
        }
        if(counter >= 3){
            return true;
        }
        return false;
    }

}
