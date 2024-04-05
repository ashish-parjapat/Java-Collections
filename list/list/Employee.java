package list;

public class Employee  implements Comparable{

    public int Empid;
    public String Ename;
    public double Sal;
    public int Deptno;


    public Employee(int Empid,String Ename,double Sal,int Deptno){
        this.Empid=Empid;
        this.Ename=Ename;
        this.Sal=Sal;
        this.Deptno=Deptno;

    }


    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub

       Employee e=(Employee)o;
       return this.Empid-e.Empid;

    
        // Employee s=(Employee)o;
        // if(this.Empid>s.Empid){
        //     return 1;
        // }
        // else if(this.Empid<s.Empid){
        //     return -1;
        // }
        // else{
        //     return 0;
        // }
    }
   
    
    
}
