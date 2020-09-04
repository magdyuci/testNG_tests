package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExample {
    @Test
    public void myTest() {
        try {
            Assert.assertTrue(checkBigger(5, 10));
        } catch (AssertionError e) {
            System.out.println("error");
        } finally {
            {
                System.out.println("End of my Test");
            }
        }

    }
    @Test
    public void myTestOne() {
        Assert.assertTrue(checkBigger(5, 10));
        System.out.println("error");
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
