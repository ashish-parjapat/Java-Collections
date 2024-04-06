// Java TreeSet class contains unique elements only like HashSet.
// Java TreeSet class access and retrieval times are quite fast.
// Java TreeSet class doesn't allow null elements.
// Java TreeSet class is non-synchronized.
// Java TreeSet class maintains ascending order.
// The TreeSet can only allow those generic types that are comparable. For example The Comparable interface is being implemented by the StringBuffer class.


package Hashhseet.LinkedHashset.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {


     public static void main(String args[]){  
 TreeSet<String> set=new TreeSet<String>();  
         set.add("Ravi");  
         set.add("Vijay");  
         set.add("Ajay");  
         System.out.println("Traversing element through Iterator in descending order");  
         Iterator i=set.descendingIterator();  
         while(i.hasNext())  
         {  
             System.out.println(i.next());  
         }  
           
 }  
    
}
