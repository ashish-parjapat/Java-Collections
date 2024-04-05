import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

class LinkedStackQueue implements Comparable{


    public int compareTo(Object ob) {

        LinkedStackQueue e=(LinkedStackQueue)ob;

        return this.compareTo(e);
    }



    public static void main(String[] args) {
        
     LinkedList ll=new LinkedList();


     LinkedList ll2=new LinkedList();

        //Adding elements in the LinkedList
        ll.add("Ravi");
        ll.add("Rajiv");
        ll.add("Nikil");
        ll.add("Rajan");
        System.out.println(ll); // [Ravi, Rajiv, Nikil, Rajan]

        //Add ai the Specific index using
        //add(index,object)

        ll.add(0,"Ashish");
        ll.add(5,"chintu");

        System.out.println(ll); //  [Ashish, Ravi, Rajiv, Nikil, Rajan, chintu]

        //addAll() method

        ll2.add("Alok");
        ll2.add("Anuj");
        ll2.add("Jatinder");

        ll.addAll(ll2);

        System.out.println(ll);//  [Ashish, Ravi, Rajiv, Nikil, Rajan, chintu, Alok, Anuj, Jatinder]



        // addingAll at the specific index;

       ll.addAll(2,ll2);

        System.out.println(ll); // [Ashish, Ravi, Alok, Anuj, Jatinder, Rajiv, Nikil, Rajan, chintu, Alok, Anuj, Jatinder]



        //addfirst(E e);

        ll.addFirst("Kumar");

        System.out.println(ll);//  [Kumar, Ashish, Ravi, Alok, Anuj, Jatinder, Rajiv, Nikil, Rajan, chintu, Alok, Anuj, Jatinder]


        //addLast(E e);

        ll2.addLast(12);

        System.out.println(ll2); //[Alok, Anuj, Jatinder, 12]

        //clear()

        // ll.clear();

        // System.out.println(ll); //[]


        //clone()-->It is used to return a shallow copy of an ArrayList.

        LinkedList ll3=new LinkedList();

        ll3=(LinkedList)ll2.clone();
        System.out.println(ll3);  //  [Alok, Anuj, Jatinder, 12]

        //contains(Object o)

        System.out.println(ll.contains("chintu"));  //true

        //Iterator<E> descendingIterator()--> descendingIterator()	It is used to return an iterator over the elements in a deque in reverse sequential order.

     Iterator itr=ll.descendingIterator();

       while(itr.hasNext()){
        System.out.print(itr.next()+" ");
       }

       System.out.println();
   //  Jatinder Anuj Alok chintu Rajan Nikil Rajiv Jatinder Anuj Alok Ravi Ashish Kumar 

//  E element()	It is used to retrieve the first element of a list.
System.out.println("first element");

System.out.println(ll.element());  //kumar
System.out.println(ll2.element());  //Alok


// get(int index)--> t is used to return the element at the specified position in a list.

System.out.println(ll2.get(2));  // Jatinder

//getFirst() and getLast() return first and last element

System.out.println(ll.getFirst()); //kumar
System.out.println(ll2.getLast()); //12



//int indexOf(Object o) --> It is used to return the index in a list of the first occurrence of the specified element, or -1 if the list does not contain any element.

System.err.println(ll.indexOf("Anuj")); //4

ll.add("aa");
ll.add("aa");

//int lastIndexOf(Object o)---> It is used to return the index in a list of the last occurrence of the specified element, or -1 if the list does not contain any element.


System.out.println(ll.lastIndexOf("aa"));  //14


// ListIterator<E> listIterator(int index)

//It is used to return a list-iterator of the elements in proper sequence, starting at the specified position in the list.

ListIterator itr2= ll.listIterator(5);


while(itr2.hasNext()){
    System.out.print(itr2.next()+" ");
}
System.out.println();

// Jatinder Rajiv Nikil Rajan chintu Alok Anuj Jatinder aa aa 

//boolean offer(E e)-->It adds the specified element as the last element of a list.

ll2.offer(420);
System.out.println(ll2); //[Alok, Anuj, Jatinder, 12, 420]

// boolean offerFirst(E e) and offerLast(E e)-->add element at the front and at last respectively

//E poll()	It retrieves and removes the first element of a list.
// E pollFirst()	It retrieves and removes the first element of a list, or returns null if a list is empty.
// E pollLast()	It retrieves and removes the last element of a list, or returns null if a list is empty.
// E pop()	It pops an element from the stack represented by a list.
// void push(E e)	It pushes an element onto the stack represented by a list.
// E remove()	It is used to retrieve and removes the first element of a list.
// E remove(int index)	It is used to remove the element at the specified position in a list.
// boolean remove(Object o)	It is used to remove the first occurrence of the specified element in a list.
// E removeFirst()	It removes and returns the first element from a list.






Collections.sort(ll2);
System.out.println(ll2);









   
}
}