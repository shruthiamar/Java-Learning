/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anitha.ramatenki
 */
public class ThreadExample1 extends Thread{
 public void run()  
     {    
        int a= 10;  
        int b=12;  
        int result = a+b;  
        System.out.println("Thread started running..");  
        System.out.println("Sum of two numbers is: "+ result);  
     }  
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        ThreadExample1 t1 = new  ThreadExample1();  
  
        t1.start(); 
    }
}
