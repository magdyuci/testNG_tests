package annotations;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeClassAnnotation {
    @BeforeClass
    public void beforeClassDoThis(){
        System.out.println("Before class run before all methods just one time");
    }

    @BeforeMethod
    public void beforeMethodDoThis(){
        System.out.println("Before Method run before each @Test");
    }
    @Test
    public void testDoThis(){
        System.out.println("Run the test");
    }
}
