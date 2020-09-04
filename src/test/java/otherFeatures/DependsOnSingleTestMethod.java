package otherFeatures;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class DependsOnSingleTestMethod {
    //Priority establishes the order in will run each test, otherwise will run in alphabetical order.
    @Test(dependsOnMethods = "testB")
    public void testA(){
        System.out.println("This is my test A");
        //example 1 failure
        //assertTrue(false);
    }

    @Test
    public void testB(){
        System.out.println("This is my test B");
        //example 1 failure
        assertTrue(false);
    }

    @Test(dependsOnMethods = "testD")
    public void testC(){
        System.out.println("This is my test C");
    }

    @Test
    public void testD(){
        System.out.println("This is my test D");
    }
}
