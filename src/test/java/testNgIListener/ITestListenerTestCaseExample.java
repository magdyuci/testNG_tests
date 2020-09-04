package testNgIListener;

import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ITestListenerTestCaseExample {
    int i;

    @BeforeTest
    public void beforeTest() {
        System.out.println("My before test");
    }

    @Test
    public void myTest1() {
        System.out.println("In myTest1 method");
    }

    @Test
    public void myTest2() {
        System.out.println("In myTest2 method");
        assertTrue(false);
    }

    @Test
    public void myTest3() {
        throw new SkipException("My test 2 is skipped");
    }

    @Test(successPercentage = 80, invocationCount = 5)
    public void myTest4() {
        i++;
        System.out.println("My test method invocation count is: " + i);
        if (i == 1 | i == 2) {
            System.out.println("fail my test4");
            assertTrue(false);
        }else{
            System.out.println("pass test4");
            assertTrue(true);
        }

    }

    @AfterTest
    public void afterTest() {
        System.out.println("My after test");
    }
}
