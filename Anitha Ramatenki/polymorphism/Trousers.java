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
public class Trousers extends Clothing{
    
    public Trousers(int itemId,String desc, char color, double price)
    {
    super(itemId, desc, color, price);
    }
    
    public void display(){
    System.out.println("Hello");
    }
}