
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anitha.ramatenki
 */
public class StackDemo{ 
    public static void main(String[] args){ 
        Stack<String> books=new Stack<>();  
        books.push("a"); 
        books.push("b"); 
        System.out.println("Peek: " + books.peek()); 
        System.out.println("After peek: " + books);
        System.out.println("Pop: " + books.pop()); 
        System.out.println("After pop: " + books); 
        books.pop(); System.out.println("Empty after another pop: " + books.empty()); 
        String[] bookNames={"c", "d", "e", "f", "g"};
    for(String name: bookNames){ 
        books.push(name); 
} 
    System.out.println("After loop to push array elements onto Stack: "); 
    
    System.out.println(books); 
    System.out.println("Peek: " + books.peek()); 
    System.out.println("Size: " + books.size()); 
    System.out.println("First element: " + books.firstElement()); 
    System.out.println("Last element: " + books.lastElement());
} 
}
