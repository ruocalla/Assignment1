package ct417_assignment1;

import java.util.ArrayList;

public class Course {
    
    private String Course;
    private ArrayList<Student> Students = new ArrayList();
    private ArrayList<CourseModule> CourseModule = new ArrayList();

    private String StartDate;
    private String FinishDate;
    
    public Course(String Course){
        this.Course = Course;
    }
    
    //Get Student method
      public ArrayList<Student> getStudents(){
        return this.Students;
    }
    
     //Get Module method     
    public ArrayList<CourseModule> getModules(){
    return this.CourseModule;
    }

    //Get Course method
    public String getCourse(){
        return this.Course;
    } 
}
