package ct417_assignment1;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
      
    @BeforeClass
    public static void setUpClass() {
    }    
    @Before
    public void setUp() {
    }    
    @Test
    public void testGetUsername() {
        Student Ruairi = new Student("Ruairí", 22);
        String Username;
        Username = (Ruairi.getUsername());
        assertEquals(Username, "dave");
        System.out.println("Test Passed");
        }
    @After
    public void tearDown() {
    }     
    @AfterClass
    public static void tearDownClass() {
    }
}
