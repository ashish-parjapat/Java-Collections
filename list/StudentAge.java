import java.util.Comparator;

public class StudentAge implements Comparator<Student>{

    @Override
    public int compare(Student st0, Student st1) {

        if(st0.Age>st1.Age){
            return 1;
        }
       else if(st0.Age<st1.Age){
            return -1;
        }
        else{
            return 0;
        }
         
        
        

        
    }
    
}

