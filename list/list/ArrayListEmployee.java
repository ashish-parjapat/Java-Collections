package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ArrayListEmployee {

    public static void main(String[] args) {


        ArrayList<Employee>Emp=new ArrayList<Employee>();
        Emp.add(new Employee(5,"Prince",15560.2,1011));
        Emp.add(new Employee(1,"Ravi",150.2,101));
        Emp.add(new Employee(2,"Rajiv",1500.2,1001));
        Emp.add(new Employee(3,"chintu",15120.2,1201));
        Emp.add(new Employee(4,"Ankit",15450.2,1010));
       


        Emp.remove(2);

        //using get method
        System.out.println(Emp.get(2));

        //for loop

        for (int i = 0; i < Emp.size(); i++) {

            System.out.print(Emp.get(i).Empid+" "+Emp.get(i).Ename+" "+Emp.get(i).Sal+" "+Emp.get(i).Deptno);
            
        }
        System.out.println();

        //using ForEach

        for(Employee e:Emp){
            System.out.print(e.Empid+" "+e.Ename+" "+e.Sal+" "+e.Deptno);
        }
        System.out.println();


        //using iterator

        //how to print using iterator


        ListIterator itr=Emp.listIterator();
      

        while(itr.hasNext()){
            Employee e=(Employee)itr.next();
            System.out.print(e.Empid+" "+e.Ename+" "+e.Sal+" "+e.Deptno+" ");
        }
        System.out.println();

        System.out.println("Going backward");

        while(itr.hasPrevious()){
            Employee e=(Employee)itr.previous();
            System.out.print(e.Empid+" "+e.Ename+" "+e.Sal+" "+e.Deptno+" ");

        }
        System.out.println();

       
        //adding two elemets
        Emp.add(new Employee(6,"Ravii",158590.2,15601));
        Emp.add(new Employee(7,"Rajivv",1504560.2,100891));
      
      
        ListIterator li=Emp.listIterator();
        //printing using iterator

        while(li.hasNext()){
            Employee e=(Employee)li.next();
            System.out.println(e.Empid+" "+e.Ename+" "+e.Sal+" "+e.Deptno);
        }


        System.out.println("After sorting");
        Collections.sort(Emp);
        for(Employee e:Emp){
            System.out.print(e.Empid+"  "+e.Ename+" "+e.Sal+" "+e.Deptno+" ");
        }
        System.out.println();
        

    }


  
    
}
