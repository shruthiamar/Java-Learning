/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anitha.ramatenki
 */
import java.util.ArrayList;
import java.util.Arrays; 
import java.util.Collections; 
import java.util.List;
public class ArrayListConversion{ 
    public static void main(String[] args){ 
        int[] nums={5, 43, 99, 27, -50, 100022, -75, 0, 1, 7, 2, 774}; 
        List<Integer> numContainer=new ArrayList<>(nums.length);
        for(int num : nums){
            numContainer.add(num); 
        }
        System.out.println("numContainer: " + numContainer); 
        Collections.sort(numContainer);
        int[] returnedInts=new int[numContainer.size()]; 
        for(int i =0; i<numContainer.size(); i++){ 
            returnedInts[i]=numContainer.get(i); } 
        System.out.println("returnedInts: " + Arrays.toString(returnedInts));
    } 
}
