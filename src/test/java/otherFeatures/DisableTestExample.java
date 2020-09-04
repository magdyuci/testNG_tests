package otherFeatures;

import org.testng.annotations.Test;

public class DisableTestExample {

    @Test(enabled = false)
    public void myTestOne() {
        System.out.println("Running my test One");
    }

    @Test
    public void myTestTwo() {
        System.out.println("Running my test Two");
    }
}
