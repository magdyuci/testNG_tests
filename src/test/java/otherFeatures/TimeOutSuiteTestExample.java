package otherFeatures;

import org.testng.annotations.Test;

public class TimeOutSuiteTestExample {

    @Test(timeOut = 10000)
    public void myTestOne() throws InterruptedException {
        System.out.println("Running my test One");
        Thread.sleep(6000);
        System.out.println("Finishing my test one");
    }

    @Test
    public void myTestTwo() throws InterruptedException {
        System.out.println("Running my test Two");
        Thread.sleep(6000);
        System.out.println("Finishing my test two");
    }
}
