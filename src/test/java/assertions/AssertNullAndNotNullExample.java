package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNullAndNotNullExample {
    String one = null;
    String two = "two";

    @Test
    public void nullTest() {
        Assert.assertNull(one);
    }

    @Test
    public void nullMessageTest() {
        Assert.assertNull(two, "That no is null");
    }

    @Test
    public void notNullTest() {
        Assert.assertNotNull(two);
    }

    @Test
    public void notNullMessageTest() {
        Assert.assertNotNull(one, "That no is null");
    }

}
