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
public abstract class Student {
   private  String name;
   private String am;    
   
   public Student(String name, String am){
       this.name=name;
       this.am=am;
   }
   public String getName(){
       return this.name;
   }
   public void setName(String name){
      this.name=name; 
   }
    public String getAm(){
       return this.am;
   }
   public void setAm(String am){
      this.am=am; 
   }
   public void displayInfo(){
       System.out.println(this.name + " , "+ this.am);
   }
}
