import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class Student implements Comparable<Student> {

    int Sid;
    String Sname;
    int Age;
    double Perc;



    public Student(int Sid, String Sname, int Age, double Perc) {

        this.Sid=Sid;
        this.Sname=Sname;
        this.Age=Age;
        this.Perc=Perc;
        
    }

    @Override
    public int compareTo(Student s1) {
      return this.Sname.compareTo(s1.Sname);
    }

  


    public static void main(String[] args) {

        ArrayList<Student>s=new ArrayList<Student>();
        s.add(new Student(1,"Ravi",21,85.2));
        s.add(new Student(2,"Rajiv",22,86.2));
        s.add(new Student(3,"Mangal",23,80.2));
        s.add(new Student(4,"Chintu",24,88.2));
        s.add(new Student(5,"Rajan",25,89.2));


        //Print using get method

        for (int i = 0; i < s.size(); i++) {
            System.out.print(s.get(i).Sid+" "+s.get(i).Sname+" "+s.get(i).Age+" "+s.get(i).Perc+" ");
        }
        System.out.println();
        System.out.println("--------------------------------------");

        //sorting based on comparable

  Collections.sort(s);

  for (int i = 0; i < s.size(); i++) {
    System.out.print(s.get(i).Sid+" "+s.get(i).Sname+" "+s.get(i).Age+" "+s.get(i).Perc+" ");
}
System.out.println();

//printing using iterator

System.out.println("Printing using iterator");
ListIterator itr= s.listIterator();

while(itr.hasNext()){

    Student s0=(Student)itr.next();
    System.out.print(s0.Sid+" "+s0.Sname+" "+s0.Age+" "+s0.Perc+" ");
}
System.out.println();
System.out.println("-------------------------");

System.out.println("Based on age soring");
Collections.sort(s, new StudentAge());

for (Student st : s) {
    System.out.println(st.Sid+" "+st.Sname+" "+st.Age+" "+st.Perc);
    
}
System.out.println(" -----------------------------");

System.out.println("Based on Perc Sorting");
Collections.sort(s, new StudentPerc());

for (Student st : s) {
    System.out.println(st.Sid+" "+st.Sname+" "+st.Age+" "+st.Perc);
    
}
System.out.println(" -----------------------------");

System.out.println("Based on Sid Sorting");
Collections.sort(s, new StudentSid());

for (Student st : s) {
    System.out.println(st.Sid+" "+st.Sname+" "+st.Age+" "+st.Perc);
    
}
System.out.println(" -----------------------------");

        
    }




  



   
    
}
