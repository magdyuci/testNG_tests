package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {
    @Test
    public void myTestOne() {
        SoftAssert softassert = new SoftAssert();
        //Assert.assertTrue(checkBigger(5, 10));
        softassert.assertTrue(checkBigger(5, 10));
        System.out.println("error of softassert");
        softassert.assertAll();
    }

    @Test
    public void myTestTwo() {
        Assert.assertTrue(checkBigger(10, 5));
        System.out.println("End of my Test");

    }

    public boolean checkBigger(int x, int y) {
        boolean result;
        if (x > y) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
