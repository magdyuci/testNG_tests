package testNgIExecutionListener;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class IExecutionListenerTestCaseExample {
    @BeforeSuite
    public void myTestA(){
        System.out.println("Before suite");
    }

    @Test
    public void myTestCase(){
        System.out.println("My test case");
    }

    @AfterSuite
    public void myTestC(){
        System.out.println("After suite");
    }
}
