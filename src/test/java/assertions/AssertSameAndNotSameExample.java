package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertSameAndNotSameExample {
    String one = "abc";
    String two = "abc";
    String three = "dfg";

    @Test
    public void sameTest() {
        Assert.assertSame(one, two);
    }

    @Test
    public void sameMessageTest() {
        Assert.assertSame(one, three, "One is not same ");
    }

    @Test
    public void notSameTest() {
        Assert.assertNotSame(one, three);
    }

    @Test
    public void notSameMessageTest() {
        Assert.assertNotSame(one, two, "One is not same ");
    }

}
