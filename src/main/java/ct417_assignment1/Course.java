package ct417_assignment1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Course {
    public ArrayList <CourseModule>Courses = new ArrayList<CourseModule>();
    public String Course;
    public String StartDate;
    public String EndDate;

    public Course(String Course, String StartDate, String EndDate) {  
        
        this.Course = Course;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String Course) {
        this.Course = Course;
    }

    public void setModules(ArrayList<CourseModule> Courses) {
        this.Courses = Courses;
    }    
    

}
