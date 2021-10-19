/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package settermethod;

/**
 *
 * @author anitha.ramatenki
 */
public class SetterCheckingDemo 
{
   public static void main(String args[])
   {
   Shirt theShirt=new Shirt();
   theShirt.setColorCode('R');
   System.out.println("Color code:"+ theShirt.getColorCode());
   theShirt.setColorCode('X');
   System.out.println( "Color code:"+theShirt.getColorCode());
    }
    
}
