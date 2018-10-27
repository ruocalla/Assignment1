package ct417_assignment1;

import java.util.ArrayList;

public class Student {
    
    private String Name;
    private int Age;    
    private String DOB;
    private int ID;
    private String Username;
    private ArrayList<Course> CourseList = new ArrayList();
    private ArrayList<CourseModule> ModList = new ArrayList();
    
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
        return CourseList;
    }
    public void setCourses(ArrayList<Course> courses) {
        this.CourseList = CourseList;
    }
    
     // Get & Set Modules (Cannot be called 'Module' as it conflicts with other ecternal variables) 
    public ArrayList<CourseModule> getCourseModules() {
        return ModList;
    }
    public void setCourseModules(ArrayList<CourseModule> ModList) {
        this.ModList = ModList;
    }
}    

    
  



