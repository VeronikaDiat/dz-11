import org.example.Person;
import org.example.Woman;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestGetters {

    private Woman woman;
    private Woman person2;


    @BeforeMethod
    public void setUp() {
        woman = new Woman("Julia", "Ivanenko", 90);
        person2 = new Woman();
        woman.setPartner(person2);
    }

    @Test
    public void testGetFirstName() {
        Assert.assertEquals(woman.getFirstName(), "Julia", "FirstName is not valid");
    }

    @Test
    public void testGetLastName() {
        Assert.assertEquals(woman.getLastName(), "Ivanenko", "LastName is not valid");
    }

    @Test
    public void testPartner() {
        Person retrievedPartnerWoman = woman.getPartner();
        Assert.assertEquals(person2, retrievedPartnerWoman, "Partner is not exist");
    }
}