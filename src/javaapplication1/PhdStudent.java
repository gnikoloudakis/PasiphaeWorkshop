/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author root
 */
public class PhdStudent extends Student{
    String thesis;
    public PhdStudent(String name, String am, String thesis){
        super(name,am);
        this.thesis=thesis;
        
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println(this.thesis);
        
    }
    
}
