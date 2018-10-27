package ct417_assignment1;

import java.util.ArrayList;

public class Student {
    
    private String Name;
    private int Age;    
    private String DOB;
    private int ID;
    private String Username;
    private ArrayList<Course> Course = new ArrayList();
    private ArrayList<CourseModule> CourseModule = new ArrayList();
    
    public Student(String name,int age){
        
        this.Name = Name;
        this.Age = Age;
    }
    
    //Getters & Setters
    public String getUsername() {
    this.Username = this.getName() + this.getAge();
    return Username;
    }
    
    // Get & Set Name 
    public void setName(String name){
        this.Name = Name;
    }
    public String getName(){
        return this.Name;
    }
    
     // Get & Set Age 
    public void setAge(int age) {
        this.Age = Age;
    } 
    public int getAge() {
        return Age;
    }
    
     // Get & Set Date Of Birth 
    public void setDOB(String dob) {
        this.DOB = DOB;
    }
    public String getDOB() {
        return DOB;
    }
    
     // Get & Set ID number  
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    
     // Get & Set Course 
    public ArrayList<Course> getCourses() {
        return Course;
    }
    public void setCourses(ArrayList<Course> courses) {
        this.Course = Course;
    }
    
     // Get & Set Modules (Cannot be called 'Module' as it conflicts with other ecternal variables) 
    public ArrayList<CourseModule> getCourseModules() {
        return CourseModule;
    }
    public void setCourseModules(ArrayList<CourseModule> CourseModule) {
        this.CourseModule = CourseModule;
    }
}    

    
  



