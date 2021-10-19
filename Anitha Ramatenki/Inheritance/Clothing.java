/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anitha.ramatenki
 */
package p9;

public class Clothing {
    
   public int itemId=0;
   
    public String desc="-desccription required-";
    
    public char colorCode='U';
    
    public char size='-';
    
    public double price=0.0;
    
    //constructor
    public Clothing(int itemId,String desc,char color,double price)
    {
    
    this.itemId=itemId;
    
    this.desc=desc;
    
    
    this.colorCode=color;
    
    this.price=price;
    }
    
    public void display(){
    
        System.out.println("-display required-");}
    
    public void setSize(char Size)
    {
    
        this.size=size;
    }
}
