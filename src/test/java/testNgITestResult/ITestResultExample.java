package testNgITestResult;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ITestResultExample {
    @Test
    public void myTestA() {
        System.out.println("I am in my test A Method");
        assertTrue(true);
    }

    @Test
    public void myTestB() {
        System.out.println("I am in my test B Method");
        assertTrue(false);
    }

    @AfterMethod
    public void getStatus(ITestResult myTestStatus) {
        if (myTestStatus.getStatus() == ITestResult.SUCCESS) {
            System.out.println("Pass: The test was success: " + myTestStatus.getMethod().getMethodName());
        } else if (myTestStatus.getStatus() == ITestResult.FAILURE) {
            System.out.println("Fail: The test was failure: " + myTestStatus.getMethod().getMethodName());
        }
    }

}

