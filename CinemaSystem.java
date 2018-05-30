/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qa.java;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Bibek
 */
public class CinemaSystem {
    Scanner kb = new Scanner(System.in);
    Standard st = new Standard();
    Student stu = new Student();
    OAP oap = new OAP();
    Child chi = new Child();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to QA Cinemas");
        System.out.println(" Enter a number corresponding to the ticket you want to buy ");
        CinemaSystem  cS = new CinemaSystem();
        cS.menu();
        cS.tickets();
        cS.isWed();
        
    }
    
    public void menu(){
        System.out.println("1. Standard Admission");
        System.out.println("2. Student Admission");
        System.out.println("3. OAP Admission");
        System.out.println("4. Child Admission");
        System.out.println("5. Checkout");
        
}
    public void tickets(){
        boolean quit = false;
        while(!quit){
            int choice = kb.nextInt();
            if(choice == 1){
                st.add(1);
            }
            else if(choice == 2){
                stu.add(1);
            }
            else if(choice == 3){
                oap.add(1);
            }
            else if(choice == 4){
                chi.add(1);
            }
            else{
                quit = true;
            }
            
    }
    }
    
    public double total(){
        return st.getPrice(st.num) + stu.getPrice(stu.num) + oap.getPrice(oap.num) + chi.getPrice(chi.num);
    }
    public double total(boolean isWed){
        return (st.getPrice(st.num) - st.num * 2) + (stu.getPrice(stu.num)- stu.num * 2) + (oap.getPrice(oap.num)- oap.num * 2) + (chi.getPrice(chi.num) - chi.num * 2);
    }
    
    public boolean isWed(){
        Calendar cal = Calendar.getInstance();
        boolean wed = cal.get(Calendar.DAY_OF_WEEK) == Calendar.WEDNESDAY;
        
        if(wed){
            System.out.println("It is a Wednesday today! £2 off any ticket!");
            System.out.println("Total : " + total(wed));
        }
        else{
            System.out.println("Just a regular day");
            System.out.println("Total : " + total());
        }
        
        return wed;
    }
    
}

