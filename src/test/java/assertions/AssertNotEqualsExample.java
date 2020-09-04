package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotEqualsExample {

    @Test
    public void notEqualsBooleanTest() {
        Assert.assertNotEquals(myMethod(0, 5), true);
    }

    @Test
    public void notEqualsIntTest() {
        Assert.assertNotEquals(10, 10);
    }

    @Test
    public void notEqualsStringTest() {
        Assert.assertNotEquals("MAMA", "MAMaa");
    }

    @Test
    public void notEqualsWithMessage() {
        Assert.assertNotEquals(myMethod(10, 5), true, "The test is correct");
    }

    public boolean myMethod(int x, int y) {
        boolean result;
        if (x > y) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }


}
