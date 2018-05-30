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
public class Student extends Standard{
    public int num;
    public Student(){
    }
    
    @Override
    public double getPrice(int people){
        return (price * 0.75) * people;
    }
    
    @Override
    public void add(int num){
        this.num +=num;
        System.out.println( num + " Student has been added");
    }

    @Override
    public int amount() {
        return num;
    }
    
}

