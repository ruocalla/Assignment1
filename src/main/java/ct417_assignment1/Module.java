package ct417_assignment1;

import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import static java.util.Collections.list;
import java.util.List;

public class Module {
    public String Module;
    public String Course;
    public String ModuleName;
    public String ModID;
    public List <Student> Students;
   

    public Module(String Module, String ModuleName, String ModuleID) {
        
    }
    
    public void main(String[] args) {
       
       
          Module CT417 = new Module("ECE", "Software Engineering", "CT417");
          
          System.out.println("Module = " + CT417.getModule());

    
    }

    public String getModule(){
   
        Module = (this.getModuleName() + this.getModID());
        return Module;
    
     }   
    
    public String getModuleName() {
        return ModuleName;
    }
    
    public void setModuleName() {
        this.ModuleName = ModuleName;
    }
    
    public String getModID() {
        return ModID;
    }
    
    public void setModID() {
        this.ModID = ModID;
    }
}
