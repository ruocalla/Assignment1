package ct417_assignment1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Course {
    public ArrayList <Course>Courses;
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
    
    
    public ArrayList<Course> getCourses() {
        return Courses;
    }

    public void setCourses(ArrayList<Course> Course) {
        this.Courses = Course;
    }
    

}
