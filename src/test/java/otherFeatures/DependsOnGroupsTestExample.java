package otherFeatures;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class DependsOnGroupsTestExample {
    //Priority establishes the order in will run each test, otherwise will run in alphabetical order.
    @Test(dependsOnGroups = "Group1")
    public void testA(){
        System.out.println("This is my test A");
        //assertTrue(false);
    }

    @Test(groups = "Group1")
    public void testB(){
        System.out.println("This is my test B");
        assertTrue(false);
    }

    @Test(groups = "Group1")
    public void testC(){
        System.out.println("This is my test C");
    }
}
