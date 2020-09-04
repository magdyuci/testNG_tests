package otherFeatures;

import org.testng.annotations.Test;

public class DependsOnInheritedTestMethod extends ParentClassExample {
    @Test(dependsOnMethods = "testE")
    public void testA(){
        System.out.println("This is my test A");
    }

    @Test
    public void testB(){
        System.out.println("This is my test B");
    }

}
