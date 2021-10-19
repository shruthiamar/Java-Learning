/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author anitha.ramatenki
 */
    public class Shirt extends Clothing{
    private char fit='U';

    public char getFit(){
    return this.fit;
    }
    
    public void setFit(char fit){
    this.fit=fit;
    }
    public Shirt(int itemId, String desc, char color, double price, char fit)
    {       
        super(itemId,desc,color,price);
        this.fit=fit;
    }
    
    
   public Shirt(char fit){
        this(0,"",'R',0,fit);
        }
    public void display(){
    System.out.println("-Anitha-");}
    }
    
