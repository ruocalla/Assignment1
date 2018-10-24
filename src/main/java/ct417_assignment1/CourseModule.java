package ct417_assignment1;

import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import java.util.ArrayList;
import static java.util.Collections.list;


public class CourseModule {
    
    public ArrayList <Student> Students = new ArrayList<Student>();
    public String CourseModule;
    
     
    public CourseModule(String CourseModule) {
    this.CourseModule = CourseModule;
    
    }
    public String getCourseModule() {
        return CourseModule;
    }

    public void setModule(String Module) {
        this.CourseModule = CourseModule;
    }
    
    public ArrayList<Student> getStudents() {
        return Students;
    }

    public void setStudents(ArrayList<Student> Modules) {
        this.Students = Modules;
    }    

}
