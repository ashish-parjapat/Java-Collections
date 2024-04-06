
// ava LinkedHashSet class contains unique elements only like HashSet.
// Java LinkedHashSet class provides all optional set operations and permits null elements.
// Java LinkedHashSet class is non-synchronized.
// Java LinkedHashSet class maintains insertion order.


package Hashhseet.LinkedHashset;

import java.util.LinkedHashSet;


import java.util.Iterator;

public class LinkedHashset1 {

    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        Iterator<String> i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }

    //One
// Two
// Three
// Four
// Five
    
}
