
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anitha.ramatenki
 */
public class ArrayConcatDemo
{ 
    public static void main(String[] args)
    { 
    String[] names={"Steve", "Bob", "John"}; 
    List<String> combined=new ArrayList<>();
    combined.addAll(Arrays.asList(names)); 
    System.out.println(combined.size()); 
    System.out.println(combined);
    String[] moreNames={"Jane", "Sue", "Mary"}; 
combined.addAll(Arrays.asList(moreNames));
System.out.println(combined.size()); 
System.out.println(combined); 
}
}
