package otherFeatures;

import org.testng.annotations.Test;

public class TimeOutTestExample {

    @Test(timeOut = 10000)
    public void myTestOne() {
        System.out.println("Running my test One");
        for (;;){
            System.out.println("welcome to the word");
        }
    }

    @Test
    public void myTestTwo() {
        System.out.println("Running my test Two");
    }
}
