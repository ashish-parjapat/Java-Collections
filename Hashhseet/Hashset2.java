package Hashhseet;

import java.util.HashSet;

import java.util.Iterator;

public class Hashset2 {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();

        set.add("Ravi");
        set.add("vijay");
        set.add("Ravi");
        set.add("vijay");
        set.add(null);
       

        // traversing the set
        Iterator<String> i = set.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }
    }

   //null
    //Ravi
    //vijay
    
}
