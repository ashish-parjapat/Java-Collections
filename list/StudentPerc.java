import java.util.Comparator;

public class StudentPerc implements Comparator<Student>{

    @Override
    public int compare(Student st0, Student st1) {

        if(st0.Perc>st1.Perc){
            return 1;
        }
       else if(st0.Perc<st1.Perc){
            return -1;
        }
        else{
            return 0;
        }
         
        
        

        
    }
    
}
