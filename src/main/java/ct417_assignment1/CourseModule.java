package ct417_assignment1;

import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import java.util.ArrayList;
import static java.util.Collections.list;

public class CourseModule {

    public ArrayList <CourseModule>Modules;
    public String CourseModule;
   
     
    public CourseModule(String CourseModule) {
    this.CourseModule = CourseModule;
    
    }
    public String getCourseModule() {
        return CourseModule;
    }

    public void setModule(String Module) {
        this.CourseModule = Module;
    }
    
    
    public ArrayList<CourseModule> getModules() {
        return Modules;
    }

    public void setModules(ArrayList<CourseModule> Modules) {
        this.Modules = Modules;
    }

}
