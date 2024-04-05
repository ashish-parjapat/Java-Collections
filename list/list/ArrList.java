package list;


import java.util.*;



/**
 * ArrList
 */
public class ArrList {

    public static void main(String[] args) {


        //List Interface Methods


        // add and addAll method
        ArrayList a=new ArrayList();

        ArrayList b=new ArrayList();

        a.add(0, "Hello");
        a.add(1, 25);

        b.add("World");
        b.add(56);


        System.out.println(a);  //  [Hello, 25]
        System.out.println("---------------------------");
        System.out.println(b);   // [World, 56]


        a.addAll(b);  
        System.out.println(a);  //[Hello, 25, World, 56]


        //Search an element

        //indexOf()method

        System.out.println(a.indexOf(25));  //1


        //  Remove the elements

        //remove(int index)

        a.remove(0);
        System.out.println(a); // [25, World, 56]

        System.out.println("------------------------");

        //add(index,object)

        a.add(0,"Hello");

        System.out.println(a);  //[Hello, 25, World, 56]


        //Acess the elements
        //iterator()
        //getindex(int index)


        System.out.println(a.get(1));  //25

        System.out.println("--------------------------------");

        //contains(object)

     boolean isPresent=   a.contains(56);
     System.out.println(isPresent);  //true
System.out.println();
System.out.println();

System.out.println();
System.out.println();
System.out.println("--------------------------------");

     //creating a new generic ArrayList

     ArrayList<Integer> arr=new ArrayList<Integer>();

     //ADD elements into arr

     arr.add(10);
     arr.add(20);
     arr.add(30);
     arr.add(40);
     arr.add(50);

    // System.out.println(arr[0]); //cannot access using index use get() method

    System.out.println(arr); // [10, 20, 30, 40, 50]
    System.out.println();
    System.out.println();
    System.out.println();


    //Iterating the collection 

    // 1. using for loop

System.out.println("Travesing using for loop");
    for (int index = 0; index < arr.size(); index++) {

        System.out.print(arr.get(index)+" ");
        
    }

    // 10 20 30 40 50 
    System.out.println();

System.out.println("------------------------------------");

// 2. using forEach loop
System.out.println("Travesing using forEach loop");

    for(int x:arr){
        System.out.print(x+" ");
    }
    System.out.println();
    System.out.println("---------------------------");


    // using iterator()
    System.out.println("using iterator() method");

    System.out.println(arr.iterator());  //java.util.ArrayList$Itr@4e0e2f2a


  Iterator itr=arr.iterator();

 while(itr.hasNext()){
    System.out.print(itr.next()+" ");
 }

 System.out.println();   //10 20 30 40 50 





    }
}