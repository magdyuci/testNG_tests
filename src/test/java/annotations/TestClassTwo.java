package annotations;

import base.TestBase;
import org.testng.annotations.*;

public class TestClassTwo extends TestBase {
    @BeforeClass
    public void beforeClassTestClassTwo(){
        System.out.println("Before class TestClassTwo");
    }
    @BeforeMethod
    public void beforeMethodClassTestClassTwo(){
        System.out.println("Before Method TestClassTwo");
    }
    @Test
    public void testATestClassTwo(){
        System.out.println("Test A TestClassTwo)");
    }
    @Test
    public void testBTestClassTwo(){
        System.out.println("Test B TestClassTwo");
    }

    @AfterMethod
    public void afterMethodTestClassTwo(){
        System.out.println("After Method TestClassTwo");
    }
    @AfterClass
    public void afterClassTestClassTwo(){
        System.out.println("After Class TestClassTwo");
    }
}
