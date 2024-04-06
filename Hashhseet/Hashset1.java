
// HashSet stores the elements by using a mechanism called hashing.
// HashSet contains unique elements only.
// HashSet allows null value.
// HashSet class is non synchronized.
// HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
// HashSet is the best approach for search operations.
// The initial default capacity of HashSet is 16, and the load factor is 0.75.






package Hashhseet;

import java.util.*;



public class Hashset1 {

    public static void main(String[] args) {
        
        HashSet<String>set=new HashSet();

        set.add("one");
        set.add("two");
        set.add("Three");
        set.add("Four");
        set.add("1");


        Iterator<String>i=set.iterator();

        while(i.hasNext()){
            System.out.println(i.next()+" "+i.hashCode());
        }


// 1 1933863327
// one 1933863327
// Four 1933863327
// two 1933863327
// Three 1933863327

        
        
    }
    
}
