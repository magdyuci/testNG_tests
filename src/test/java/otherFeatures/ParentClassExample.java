package otherFeatures;

import org.testng.annotations.Test;

public class ParentClassExample {
    @Test(dependsOnMethods = "testF")
    public void testE(){
        System.out.println("This is my test E");
    }

    @Test
    public void testF(){
        System.out.println("This is my test F");
    }
}
