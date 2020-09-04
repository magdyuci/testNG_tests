package otherFeatures;

import org.testng.annotations.Test;

public class DependsOnGroupsDependsOnMethodTestExample {
    //Priority establishes the order in will run each test, otherwise will run in alphabetical order.
    @Test(dependsOnGroups = "Group1")
    public void testA(){
        System.out.println("This is my test A");
    }

    @Test(groups = "Group1")
    public void testB(){
        System.out.println("This is my test B");
    }

    @Test(groups = "Group1", dependsOnMethods = "testD")
    public void testC(){
        System.out.println("This is my test C");
    }

    @Test
    public void testD(){
        System.out.println("This is my test D");
    }
}
