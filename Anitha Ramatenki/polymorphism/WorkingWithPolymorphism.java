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
public class WorkingWithPolymorphism {
    public static void main(String[] args){
    Clothing garment1 =new Shirt(1,"", 'R',0.30,'L');
    Clothing garment2 =new Trousers(2,"",'Y',10);
    Clothing[] d={garment1, garment2};
    displayClothes(d);    
}

public static void displayClothes(Clothing[] d){
for(Clothing c:d){
c.display();
if(c instanceof Shirt){
char fit=((Shirt)c).getFit();
System.out.println("--This shirt has a fit of"+ fit+ "'--'");
};
}
}
}
