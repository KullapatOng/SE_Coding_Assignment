import org.junit.Assert;
import org.junit.Test;

public class Usertest {

    User user = new User();

    @Test
    public void testUserWithName(){
        Assert.assertEquals("User: Raijin is add successfully", user.addUser("Raijin"));
    }
    @Test
    public void testUserWithNull(){
        Assert.assertEquals("Please provide the username", user.addUser(""));
    }
    @Test
    public void testUserWithAdmin(){
        Assert.assertEquals("Username Admin is not allowed", user.addUser("Admin"));
    }
}
