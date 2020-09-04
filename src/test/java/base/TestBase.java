package base;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestBase {
    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("Starting Selenium drivers");
    }
    @AfterSuite
    public void AfterSuite(){
        System.out.println("Stoping Selenium drivers");
    }

    @BeforeTest
    public void BeforeTest(){
        System.out.println("Starting Before test");
    }
    @AfterTest
    public void AfterTest(){
        System.out.println("Stoping After test");
    }
}
