package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualsExample {

    @Test
    public void equalsBooleanTest() {
        Assert.assertEquals(myMethod(0, 5), true);
    }

    @Test
    public void equalsIntTest() {
        Assert.assertEquals(10, 10);
    }

    @Test
    public void equalsStringTest() {
        Assert.assertEquals("MAMA", "MAMa");
    }

    @Test
    public void equalsWithMessage() {
        Assert.assertEquals(myMethod(10, 5), true, "The test is correct");
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
