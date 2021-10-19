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
public class Shirt {
    private  int shirtId=0;
    private String description="-desccription required-";
    public char colorCode='U';
    private double price=0.0;
     
   public char getColorCode(){
   return colorCode;} 
   
    public void setColorCode(char newCode)
    {
    if(newCode=='R'){
    colorCode=newCode;
    return;
    } 
    if(newCode=='G'){
    colorCode=newCode;
    return;
    } 
     if(newCode=='B'){
    colorCode=newCode;
    return;
    } 
    System.out.println("Invalid colorcode. Use R,G, B");
    }

    void setColorCode(String r) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
   
