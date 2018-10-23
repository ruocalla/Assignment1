package ct417_assignment1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

public class StudentTest {
     
      
    @BeforeClass
    public static void setUpClass() {
    }

         
    @Before
    public void setUp() {
    }
    
    @Test
    public void testGetUsername() {
      
        Student Ruairi = new Student("Ruairí", 22, "27/08/1996" , 15361646, "ECE", "Software Engineering");
        
        String Username;
        Username = (Ruairi.getUsername());
        
        assertEquals(Username, "Ruairí22");
        System.out.println("Test Passed");
        }
     

    @After
    public void tearDown() {
    }     

    @AfterClass
    public static void tearDownClass() {
    }
 
    

}
