package otherFeatures;

import org.testng.annotations.Test;

public class PriorityExample {
    //Priority establishes the order in will run each test, otherwise will run in alphabetical order.
    @Test(priority = 1)
    public void testOne(){
        System.out.println("This is my test One");
    }

    @Test(priority = 2)
    public void testTwo(){
        System.out.println("This is my test Two");
    }

    @Test(priority = 3)
    public void testThree(){
        System.out.println("This is my test Three");
    }
}
