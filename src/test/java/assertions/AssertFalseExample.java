package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFalseExample {

    @Test
    public void falseExample() {
       Assert.assertFalse(myMethod(0,5));
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
    public void falseExampleWithMessage(){
        Assert.assertFalse(myMethod(0,5), "The first number is grater that de second number");
    }
}
