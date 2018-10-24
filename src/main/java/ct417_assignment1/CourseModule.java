package ct417_assignment1;

import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import java.util.ArrayList;
import static java.util.Collections.list;


public class CourseModule {
    
    public ArrayList <CourseModule>Modules = new ArrayList<CourseModule>();    
     
    public CourseModule(ArrayList<CourseModule> Modules) {
    this.Modules = Modules;    
    }

    public void setModule(ArrayList<CourseModule> Modules) {
    this.Modules = Modules;
    }    
    
    public ArrayList<CourseModule> getModule() {
    return Modules;
    
    }
   
}
