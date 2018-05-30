/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qa.java;

/**
 *
 * @author Bibek
 */
public class Standard implements Ticket{
    public int num;
    public double price = 8;
    
    public Standard(){
    }
    @Override
    public double getPrice(int people){
        return price * people;
    }
    
    @Override
    public void add(int num){
        this.num +=num;
        System.out.println( num + " Standard has been added");
    }

    @Override
    public int amount() {
        return num;
    }
    
}
