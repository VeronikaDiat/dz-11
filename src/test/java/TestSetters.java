import org.example.Man;
import org.example.Person;
import org.example.Woman;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class TestSetters {
    Man man = new Man();
    Man person2 = new Man();

    public void setUp() {
        man.setAge(20);
    }

    @Test
    public void testSetName() {

        man.setFirstName("Petro");
        Assert.assertEquals(man.getFirstName(), "Petro", "Name is required");
    }
    @Test
    public void testSetFirstLastName() {
        man.setLastName("Yevtushenko");
        Assert.assertEquals(man.getLastName(), "Yevtushenko", "LastName is required");
    }
    @Test
    public void testAreRetired(){
        Assert.assertFalse(man.isRetired(), "Is not retired");
    }
    @Test
    public void testPartner() {
        man.setPartner(person2);
        Assert.assertTrue(man.isPartner(), "Person have partner");




        }
    }
