package ct417_assignment1;

import java.util.ArrayList;

public class Course {
    
    private String Course;
    private ArrayList<Student> StudList = new ArrayList();
    private ArrayList<CourseModule> ModList = new ArrayList();

    private String StartDate;
    private String FinishDate;
    
    public Course(String Course){
        this.Course = Course;
    }
    
    //Get Student method
      public ArrayList<Student> getStudents(){
        return this.StudList;
    }
    
     //Get Module method     
    public ArrayList<CourseModule> getModules(){
    return this.ModList;
    }
    
   
    //Get Course method
    public String getCourse(){
        return this.Course;
    } 
}
