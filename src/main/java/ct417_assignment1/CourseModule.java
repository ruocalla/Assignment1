package ct417_assignment1;


import java.util.ArrayList;


public class CourseModule {
    
    private String CourseModule;
    private String ModID;
    private String Mod;
    
    private ArrayList<Course> CourseList = new ArrayList();
    private ArrayList<Student> StudList = new ArrayList();

    
    public CourseModule (String Module, String ModID){
        this.CourseModule = CourseModule;
        this.ModID = ModID;
    }
    public ArrayList<Course> getCourses(){
    return this.CourseList;
    }
    
        //Getters & Setters
    public String getModule() {
    this.Mod = this.getModuleName() + this.getModID();
    return Mod;
    }
    
    
    public String getModuleName(){
        return this.CourseModule;
    }
    
    public String getModID(){
        return this.ModID;
    }
    
    public ArrayList<Student> getStudents(){
        return this.StudList;
        }
} 

