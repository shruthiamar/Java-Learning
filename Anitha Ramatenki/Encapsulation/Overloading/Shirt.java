/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overloading;

/**
 *
 * @author anitha.ramatenki
 */
public class Shirt {
    private String description="-desccription required-";
    public char colorCode='U';
    private double price=0.0;
    
    public Shirt(char colorCode,double price){
    setColorCode(colorCode);
    setPrice(price);
    }
    public Shirt(char colorCode, double price, String description){
    this(colorCode,price);
    setDescription(description);
    }
    public void setDescription(String newDescription)  {
    description=newDescription;
    }
    public void setPrice(double newPrice){
        if(newPrice<0.00){
        
        System.out.println("Price must not be negative");
        return;
        }
        price=newPrice;
    }
    public char getColorCode(){
    return colorCode;}
    
    
    public void setColorCode(char newCode){
    if(newCode=='R'){
        colorCode=newCode;
        return;
    }
    if(newCode=='G')
        {
        colorCode=newCode;
        return;
    }
    if(newCode=='B')
        {
        colorCode=newCode;
        return;
    }
    
    System.out.println("Invalid color code. Use R, G, B");
    }
    
    public void display(){
    System.out.println("Shirt:[" + description + ","+ colorCode + ","+ price +"]");
    }
}
