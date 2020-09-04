package annotations;

import base.TestBase;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClassOne extends TestBase {
    @BeforeClass
    public void beforeClassTestClassOne(){
        System.out.println("Before class TestClassOne");
    }
    @BeforeMethod
    public void beforeMethodClassTestClassOne(){
        System.out.println("Before Method TestClassOne");
    }
    @Test
    public void testATestClassOne(){
        System.out.println("Test A TestClassOne)");
    }
    @Test
    public void testBTestClassOne(){
        System.out.println("Test B TestClassOne");
    }

    @AfterMethod
    public void afterMethodTestClassOne(){
        System.out.println("After Method TestClassOne");
    }
    @AfterClass
    public void afterClassTestClassOne(){
        System.out.println("After Class TestClassOne");
    }
}
