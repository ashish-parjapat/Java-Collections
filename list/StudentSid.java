import java.util.Comparator;

public class StudentSid implements Comparator<Student>{

    @Override
    public int compare(Student st0, Student st1) {

        if(st0.Sid>st1.Sid){
            return 1;
        }
       else if(st0.Sid<st1.Sid){
            return -1;
        }
        else{
            return 0;
        }
         
        
        

        
    }
    
}