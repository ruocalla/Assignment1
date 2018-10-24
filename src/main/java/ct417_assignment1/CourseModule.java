package ct417_assignment1;

import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import java.util.ArrayList;
import static java.util.Collections.list;


public class CourseModule {

    public ArrayList <Student>Modules = new ArrayList<Student>();
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
    return Modules;
    }

    public void setModules(ArrayList<Student> Modules) {
        this.Modules = Modules;
    }    

}
