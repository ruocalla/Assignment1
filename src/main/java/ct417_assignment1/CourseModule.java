package ct417_assignment1;


import java.util.ArrayList;


public class CourseModule {
    
/*    public ArrayList <Student>Students = new ArrayList<Student>();    
     
    
    
    public CourseModule(ArrayList<Student> Modules) {
    this.Modules = Modules;    
    }

    public void setModule(ArrayList<Student> Modules) {
    this.Modules = Modules;
    }    
    
    public ArrayList<Student> getModule() {
    return Modules;
    
    }*/
    public class Modules {
    private String CourseModule;
    private String ID;
    
    private ArrayList<Course> Courses = new ArrayList();
    private ArrayList<Student> Students = new ArrayList();

    
    public Modules (String Module, String ID){
        this.CourseModule = CourseModule;
        this.ID = ID;
    }
    public ArrayList<Course> getCourses(){
    return this.Courses;
    }
    
    public String getModuleName(){
        return this.CourseModule;
    }
    
    public String getID(){
        return this.ID;
    }
    
    public ArrayList<Student> getStudents(){
        return this.Students;
        }
    } 
}
