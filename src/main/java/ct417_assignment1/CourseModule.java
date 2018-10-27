package ct417_assignment1;


import java.util.ArrayList;


public class CourseModule {
    
    private String CourseModule;
    private String ModID;
    
    private ArrayList<Course> Courses = new ArrayList();
    private ArrayList<Student> Students = new ArrayList();

    
    public CourseModule (String Module, String ModID){
        this.CourseModule = CourseModule;
        this.ModID = ModID;
    }
    public ArrayList<Course> getCourses(){
    return this.Courses;
    }
    
    public String getModuleName(){
        return this.CourseModule;
    }
    
    public String getModID(){
        return this.ModID;
    }
    
    public ArrayList<Student> getStudents(){
        return this.Students;
        }
} 

