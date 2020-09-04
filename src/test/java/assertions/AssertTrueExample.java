package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueExample {

    @Test
    public void trueExample() {
       Assert.assertTrue(myMethod(10,5));
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

    @Test
    public void trueExampleWithMessage(){
        Assert.assertTrue(myMethod(10,5), "The test is correct");
    }
}
