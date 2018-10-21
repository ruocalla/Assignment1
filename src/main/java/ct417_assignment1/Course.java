package ct417_assignment1;

import java.util.Date;
import java.util.List;


public class Course {
    public String Course;
    public List <Module>Modules;
    public List <Student>Students;
    public Date Start;
    public Date End;
 
   

    public Course(String Course, List Module, List Students) {
        
        Course = getCourse();
        Modules = getModules();
        Students = getStudents();
      
    }
    public void main(String[] args) {

    }
    
    
    
    public String getCourse() {
        return Course;
    }

    public void setCourse(String Course) {
        this.Course = Course;
    }

    public List<Module> getModules() {
        return Modules;
    }

    public void setModules(List<Module> Modules) {
        this.Modules = Modules;
    }

    public List<Student> getStudents() {
        return Students;
    }

    public void setStudents(List<Student> Students) {
        this.Students = Students;
    }
    
   

}
