package ct417_assignment1;


public class Student {
    public String Name;
    public int Age;
    public String DOB;
    public int ID;
    public String Course;
    public String Module;
    public String ModID;
    
    public String Username;
    
    public Student(String Name, int Age, String DOB, int ID, String Course, String Modules, String ModID) {
    
    this.Name = Name;
    this.Age = Age;
    this.DOB = DOB;
    this.ID = ID;
    this.Course = Course;
    this.Module = Module;
    this.ModID = ModID;
    
    }

         public static void main(String[] args) {
       
          Student Ruairí = new Student("Ruairí", 22, "27/08/1996" , 15361646, "ECE", "Software Engineering", "CT417");
          
          System.out.println("Username = " + Ruairí.getUsername());
          
    }   
    
   
     public String getUsername(){
   
        Username = (this.getName() + this.getAge());
        return Username;
    
     }    
     
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String Course) {
        this.Course = Course;
    }

    public String getModule() {
        return Module;
    }

    public void setModule(String Modules) {
        this.Module = Modules;
    }
    
        public String getModID() {
        return ModID;
    }

    public void setModID(String ModID) {
        this.ModID = ModID;
    }
    

   


     
}
    
  



